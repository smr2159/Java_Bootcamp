package com.ramsay.calculator;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main (String[] args) {
        int numberOne;
        int numberTwo;
        int dif = 0;

        System.out.println("This is a program that lets you subtract two numbers.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        Scanner userInput = new Scanner(System.in);

        // Prompt user for input.
        System.out.print("Enter your first number: ");
        numberOne = userInput.nextInt();
        System.out.print("Enter your second number: ");
        numberTwo = userInput.nextInt();

        // Subtract the numbers.
        dif = numberOne - numberTwo;

        // Provide the user the result.
        System.out.println("When you subtract " + numberTwo + " from " + numberOne + " the answer is " + dif + ".");

    }
}
