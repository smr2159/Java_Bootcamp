package com.ramsay.math;

/* Assignment 11: Print Even Number
   This is a program that will print all the even numbers between 1 and a defined upper limit.
   Version 2.0; created by Sharon M. Ramsay, October 12, 2022.
*/

public class PrintEvenNumber {
    public static void main (String[] args) {
        // Initialize upperLimit
        int upperLimit = 100;

        // Introduce the program
        System.out.println("Welcome to the program that prints all even numbers between 1 and " + upperLimit + ".");
        System.out.println("2222222222222222222222222222222222222222222222222222222222222222222222");
        // For loop to iterate through the numbers and print those that are even.
        for (int num = 1; num <= upperLimit; num++) {
            if (num % 2 ==0) {
                System.out.println(num + " is an even number.");
            }
        }
    }
}
