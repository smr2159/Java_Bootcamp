package com.ramsay.calculator;

// Exercise 9: Absolute difference between two numbers.
// Version 2.0; created by Sharon M Ramsay, October 12, 2022.

// Import Scanner utility.
import java.util.Scanner;

public class DifferenceBetweenTwoNumbers {
    public  static void main (String[] args) {
        int numberOne;
        int numberTwo;
        int dif = 0;

        System.out.println("This is a program that lets find the absolute difference between two numbers.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        Scanner userInput = new Scanner(System.in);

        // Prompt user for input.
        System.out.print("Please enter your first number: ");
        numberOne = userInput.nextInt();
        System.out.print("Enter your second number: ");
        numberTwo = userInput.nextInt();

        // If/else statement to find the absolute difference.
        int difference;
        if (numberOne > numberTwo) {
            difference = numberOne - numberTwo;
        }
        else {
            difference = numberTwo - numberOne;
        }

        // Provide the user the result.
        System.out.println("The absolute difference between " + numberOne + " and " + numberTwo + " is " + difference + ".");
    }
}
