package com.ramsay.insurance;

/*
This is a program that imports and analyzes a csv file containing insurance claims data.
Version 1.0
Created by Sharon M. Ramsay
October 11, 2022
 */

// Import Java utilities
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class InsuranceClaimsDashboard {
    public static void main(String[] args) {
        InsuranceClaimsDashboard dashboard = new InsuranceClaimsDashboard();
        List<String> myClaimsData = dashboard.claimsData();

        // HashMaps to group the claims data
        HashMap<String, List <String>> insuranceClaimsType = new HashMap<>();
        HashMap<String, List <String>> insuranceClaimsStatus = new HashMap<>();
        HashMap<String, List <String>> insuranceClaimsGender = new HashMap<>();
        HashMap<String, List <String>> insuranceClaimsMonth = new HashMap<>();


        for (String line : myClaimsData) {
            String[] claimsRecord = line.split(",");
                // String claimID = claimsRecord[0];
                String claimMonth = claimsRecord[1];
                // String policyHolder = claimsRecord[2];
                // Integer age = Integer.valueOf(claimsRecord[3]);
                String gender = claimsRecord[4];
                String claimType = claimsRecord[5];
                Double claimAmount = Double.valueOf(claimsRecord[6]);
                String claimStatus = claimsRecord[7];

                // Grouping claims by type
                List <String> claimTypes = insuranceClaimsType.get(claimType);
                if (claimTypes == null) {
                    claimTypes = new ArrayList<>();
                }
                claimTypes.add(line);
                insuranceClaimsType.put(claimType, claimTypes);

                // Grouping claims by status
                List <String> claimStates = insuranceClaimsStatus.get(claimStatus);
                if (claimStates == null) {
                claimStates = new ArrayList<>();
                }
                claimStates.add(line);
                insuranceClaimsStatus.put(claimStatus, claimStates);

                // Grouping claims by month
                List <String> claimMonths = insuranceClaimsMonth.get(claimMonth);
                if (claimMonths == null) {
                claimMonths = new ArrayList<>();
                }
                claimMonths.add(line);
                insuranceClaimsMonth.put(claimMonth, claimMonths);

                // Grouping claims by gender
                List <String> genders = insuranceClaimsGender.get(gender);
                if (genders == null) {
                    genders = new ArrayList<>();
                }
                genders.add(line);
                insuranceClaimsGender.put(gender, genders);
                }

            // Printing all claims status
            System.out.println("Claim Status:");
            insuranceClaimsStatus.forEach((k,v) -> {
            System.out.println(k + " = " + v.size());});

            // Printing all claims types
            System.out.println(" ");
            System.out.println("Claims Types:");
            insuranceClaimsType.forEach((k,v) -> {
            System.out.println(k + " = " + v.size());});

            // Printing all claims months
            System.out.println(" ");
            System.out.println("Claims Months:");
            insuranceClaimsMonth.forEach((k,v) -> {
            System.out.println(k + " = " + v.size());});

            // Printing all genders
            System.out.println(" ");
            System.out.println("Genders:");
            insuranceClaimsGender.forEach((k,v) -> {
            System.out.println(k + " = " + v.size());});
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


