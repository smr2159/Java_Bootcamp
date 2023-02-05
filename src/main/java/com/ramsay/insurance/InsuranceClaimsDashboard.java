package com.ramsay.insurance;

/*
This is a program that imports and analyzes a csv file containing insurance claims data.
Version 1.0
Created by Sharon M. Ramsay October 11th 2022
Last revised: January 18, 2023
 */

// Import Java utilities

import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

import static java.lang.Double.valueOf;

public class InsuranceClaimsDashboard {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        InsuranceClaimsDashboard dashboard = new InsuranceClaimsDashboard();
        List<String> myClaimsData = dashboard.claimsData();

        // HashMaps to group the claims data
        HashMap<String, List<String>> insuranceClaimsType = new HashMap<>();
        HashMap<String, List<String>> insuranceClaimsStatus = new HashMap<>();
        HashMap<String, List<String>> insuranceClaimsGender = new HashMap<>();
        HashMap<String, List<String>> insuranceClaimsMonth = new HashMap<>();

        for (String line : myClaimsData) {
            String[] claimsRecord = line.split(",");
            String claimMonth = claimsRecord[1];
            String gender = claimsRecord[4];
            String claimType = claimsRecord[5];
            Double claimAmount = valueOf(claimsRecord[6]);
            String claimStatus = claimsRecord[7];

            // Grouping claims by type
            dashboard.updateClaims(insuranceClaimsType, line, claimType);

            // Grouping claims by status
            dashboard.updateClaims(insuranceClaimsStatus, line, claimStatus);

            // Grouping claims by month
            dashboard.updateClaims(insuranceClaimsMonth, line, claimMonth);

            // Grouping claims by gender
            dashboard.updateClaims(insuranceClaimsGender, line, gender);
        }

        System.out.println(" ");
        // Calling print method to print alphabetical lists
        System.out.println("This is an apha listing of claims types:");
        dashboard.printList(insuranceClaimsType);
        System.out.println(" ");
        System.out.println("This is an apha listing of claims status:");
        dashboard.printList(insuranceClaimsStatus);
        System.out.println(" ");
        System.out.println("This is an apha listing of genders:");
        dashboard.printList(insuranceClaimsGender);
        System.out.println(" ");
        System.out.println("This is an apha listing of claims months:");
        dashboard.printList(insuranceClaimsMonth);
        System.out.println(" ");
        System.out.println(" ");
        // Calling print method to print totals
        System.out.println("Total Claims By Status:");
        dashboard.printTotals(insuranceClaimsStatus);
        System.out.println(" ");
        System.out.println("Total Claims By Type:");
        dashboard.printTotals(insuranceClaimsType);
        System.out.println(" ");
        System.out.println("Total Claims By Month:");
        dashboard.printTotals(insuranceClaimsMonth);
        System.out.println(" ");
        System.out.println("Total Claims By Gender:");
        dashboard.printTotals(insuranceClaimsGender);
    }

    private void updateClaims(HashMap<String, List<String>> insuranceClaims, String line, String claimCategory) {
        List<String> claimCategories = insuranceClaims.get(claimCategory);
        if (claimCategories == null) {
            claimCategories = new ArrayList<>();
        }
        claimCategories.add(line);
        insuranceClaims.put(claimCategory, claimCategories);
    }


    // Method to print alphabetical lists
    private void printList(HashMap<String, List<String>> myHashMap) {
        TreeSet<String> myTreeSet = new TreeSet<>(myHashMap.keySet());
        for (String item : myTreeSet)
            System.out.println(item);

    }

    // Print method for printing totals
    private void printTotals(HashMap<String, List<String>> myHashMap) {
        myHashMap.forEach((k, v) -> {
            double claimSum = 0;
            double largestAmount = 0;
            for (String line : v) {
                String[] claimsList = line.split(",");
                Double claimAmount = valueOf(claimsList[6]);
                claimSum += claimAmount;

                if (claimAmount > largestAmount) {
                    largestAmount = claimAmount;
                }
                }
            System.out.println(k + " - " + "Number of claims:" + v.size() + "   Total claims amount:$" +  df.format(claimSum) +
                    "  The largest claim amount is:$ " + df.format(largestAmount));
        });
    }

    private List<String> claimsData() {
        String fileName = "C:/claims.csv";
        // variable to store all the claims from the file
        ArrayList<String> claimsListing = new ArrayList<>();
        int rowNumber = 1;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String claim = scanner.nextLine();
                if (rowNumber != 1) {
                    claimsListing.add(claim);
                }
                rowNumber++;
            }
        } catch (IOException e) {
        }
        return claimsListing;
    }
}


