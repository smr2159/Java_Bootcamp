package com.ramsay.data_structures;

// Import Java utilities
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.max;

// This is a program that will return the highest of a user-provided list of numbers.
// Version 1.0; created by Sharon M Ramsay, October 3, 2022.

public class HighestScore {
        public static void main(String[] args) {
        System.out.println("Welcome to the Number Cruncher <(^ || ^)>");
        System.out.println("The program will return the highest of the scores entered.");
        System.out.print("How many scores do you want to compare? ");

            // Prompt user for input.
            Scanner userInput = new Scanner(System.in);
            Integer numberOfScores = userInput.nextInt();

            // Create ArrayList to hold user input.
            ArrayList<Integer> scores = new ArrayList<Integer>();

            // Loop to add scores to ArrayList.
            for (Integer i = 0; i < numberOfScores; i++) {
                System.out.print("Please enter a score: ");
                int score = userInput.nextInt();
                scores.add(score);
            }
            System.out.println("The highest score is " + max(scores));
        }
    }


