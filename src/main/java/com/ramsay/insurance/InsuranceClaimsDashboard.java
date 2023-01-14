package com.ramsay.insurance;

/*
This is a program that imports and analyzes a csv file containing insurance claims data.
Version 1.0
Created by Sharon M. Ramsay
October 11, 2022
Last revised: January 7, 2023
 */

// Import Java utilities
import java.util.*;
import java.io.*;

import static java.lang.Double.valueOf;

public class InsuranceClaimsDashboard {
    public static void main(String[] args) {
        InsuranceClaimsDashboard dashboard = new InsuranceClaimsDashboard();
        List<String> myClaimsData = dashboard.claimsData();

        // HashMaps to group the claims data
        HashMap<String, List<String>> insuranceClaimsType = new HashMap<>();
        HashMap<String, List<String>> insuranceClaimsStatus = new HashMap<>();
        HashMap<String, List<String>> insuranceClaimsGender = new HashMap<>();
        HashMap<String, List<String>> insuranceClaimsMonth = new HashMap<>();

        // TreeSets to sort the data alphabetically.
        TreeSet<String> alphaClaimTypes = new TreeSet<String>();
        TreeSet<String> alphaClaimStatus = new TreeSet<String>();
        TreeSet<String> alphaClaimGender = new TreeSet<String>();
        TreeSet<String> alphaClaimMonth = new TreeSet<String>();

        for (String line : myClaimsData) {
            String[] claimsRecord = line.split(",");
            String claimMonth = claimsRecord[1];
            String gender = claimsRecord[4];
            String claimType = claimsRecord[5];
            Double claimAmount = valueOf(claimsRecord[6]);
            String claimStatus = claimsRecord[7];

            // Entering data into HashSets
            alphaClaimTypes.add(claimType);
            alphaClaimStatus.add(claimStatus);
            alphaClaimGender.add(gender);
            alphaClaimMonth.add(claimMonth);

            // Grouping claims by type
            List<String> claimTypes = insuranceClaimsType.get(claimType);
            if (claimTypes == null) {
                claimTypes = new ArrayList<>();
            }
            claimTypes.add(line);
            insuranceClaimsType.put(claimType, claimTypes);


            // Grouping claims by status
            List<String> claimStates = insuranceClaimsStatus.get(claimStatus);
            if (claimStates == null) {
                claimStates = new ArrayList<>();
            }
            claimStates.add(line);
            insuranceClaimsStatus.put(claimStatus, claimStates);

            // Grouping claims by month
            List<String> claimMonths = insuranceClaimsMonth.get(claimMonth);
            if (claimMonths == null) {
                claimMonths = new ArrayList<>();
            }
            claimMonths.add(line);
            insuranceClaimsMonth.put(claimMonth, claimMonths);

            // Grouping claims by gender
            List<String> genders = insuranceClaimsGender.get(gender);
            if (genders == null) {
                genders = new ArrayList<>();
            }
            genders.add(line);
            insuranceClaimsGender.put(gender, genders);
        }


        // Calling print method to print alphabetical lists
        System.out.println("This is an apha listing of claims types:");
        dashboard.printList(alphaClaimTypes);
        System.out.println("This is an apha listing of claims status:");
        dashboard.printList(alphaClaimStatus);
        System.out.println("This is an apha listing of genders:");
        dashboard.printList(alphaClaimGender);
        System.out.println("This is an apha listing of claims months:");
        dashboard.printList(alphaClaimMonth);
        System.out.println(" ");

        // Calling print method to print totals
        System.out.println("Total Claims By Status:");
        dashboard.printTotals(insuranceClaimsStatus);
        System.out.println("Total Claims By Type:");
        dashboard.printTotals(insuranceClaimsType);
        System.out.println("Total Claims By Month:");
        dashboard.printTotals(insuranceClaimsMonth);
        System.out.println("Total Claims By Gender:");
        dashboard.printTotals(insuranceClaimsGender);
        }


        // Method to print alphabetical lists
        private int printList (TreeSet<String> myTreeSet) {
            for (String item : myTreeSet)
                System.out.println(item);
            return 0;
        }
        // Print method for printing totals
        private int printTotals (HashMap<String, List<String>> myHashMap) {
            myHashMap.forEach((k, v) -> {
                System.out.println(k + " = " + v.size());
            });
            return 0;
        }

            private List<String> claimsData () {
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
                    rowNumber ++;
                }
            }
            catch (IOException e) {
            }
            return claimsListing;
        }
    }


