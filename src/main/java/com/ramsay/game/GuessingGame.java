package com.ramsay.game;

/* Assignment 10: Number guessing game - one try.
   This is a number guessing game that gives the user one try to guess a randomly generated number.
   Version 2.0; created by Sharon M. Ramsay, October 12, 2022.
*/

// Import the Scanner class to enable user input.
import java.util.Scanner;

public class GuessingGame {
    public static void main (String[] args) {
        System.out.println("Welcome the the Number Guessing Game.");
        System.out.println(" ");
        System.out.println("A number is chosen between 1 and 100. Guess the number in one try.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(" ");

        // Generate a random number between 1 and 100.
        int randomNumber = (int) ((Math.random() * (100-1)) + 1);

        // Prompt user for input.
        Scanner userInput = new Scanner(System.in);
        System.out.print("Tell me what you think the number is. ");
        int userNumber = userInput.nextInt();

        // If statement to compare userNumber to randomNumber and give user feedback.
        if (userNumber == randomNumber) {
            System.out.println("Congratulations, you guessed that the number is " + randomNumber + ".");
        }
        else if (userNumber > randomNumber) {
            System.out.println("Sorry, your guess is higher than the number, which is " + randomNumber + ".");
        }
        else {
            System.out.println("Sorry, your guess is lower than the number, which is " + randomNumber + ".");
        }


    }
}
