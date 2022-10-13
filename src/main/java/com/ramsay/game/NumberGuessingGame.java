package com.ramsay.game;

/*  Assignment 12: Number guessing game - multiple tries.
    This is a modified version of the number guessing game that gives the user
    5 tries to guess a randomly generated number.
    Version 2.0; created by Sharon M. Ramsay, October 12, 2022.
*/

// Import the Scanner class to enable user input.
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main (String[] args) {
        System.out.println("Welcome the the Number Guessing Game.");
        System.out.println(" ");
        System.out.println("A number is chosen between 1 and 100. You have 5 chances to guess the number.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(" ");

        // Generate a random number between 1 and 100.
        int randomNumber = (int) ((Math.random() * (100-1)) + 1);

        // Initialize the Scanner class
        Scanner userInput = new Scanner(System.in);

        // For loop for the 5 tries
        for (int i = 0; i < 5; i++) {
            // Prompt user for input.
            System.out.print("Tell me what you think the number is: ");
            int userNumber = userInput.nextInt();

            // If statement to compare userNumber to randomNumber and give user feedback.
            if (userNumber > randomNumber) {
                System.out.println("Sorry, your guess is too high. Try again!");
            }
            else if (userNumber < randomNumber) {
                System.out.println("Sorry, your guess is too low. Try again!");
            }
            else {
                System.out.println("Congratulations, you guessed that the number is " + randomNumber + ".");
                break; // Break out of the loop if the user guesses within 5 tries
            }
        }
        System.out.println("Sorry, you are out of guesses :(");
        System.out.print("The number is " + randomNumber);
    }
}

