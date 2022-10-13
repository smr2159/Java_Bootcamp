package com.ramsay.calculator;

// Assignment 6: A program to add two integers.
// Version 2.0; created by Sharon M. Ramsay, October 11, 2022.

// Import Java Scanner class to allow user input.
import java.util.Scanner;

public class AddTwoNumber {
    public static void main (String[] args) {
        int numberOne;
        int numberTwo;
        int sum = 0;

        System.out.println("This is a program that lets you add two numbers.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        Scanner userInput = new Scanner(System.in);

        // Prompt user for input.
        System.out.print("Enter your first number: ");
        numberOne = userInput.nextInt();
        System.out.print("Enter your second number: ");
        numberTwo = userInput.nextInt();

        // Add the numbers.
        sum = numberOne + numberTwo;

        // Provide the user the result.
        System.out.println("The sum of " + numberOne + " and " + numberTwo + " is " + sum + ".");
    }
}
