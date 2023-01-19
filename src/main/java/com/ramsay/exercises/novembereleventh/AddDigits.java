package com.ramsay.exercises.novembereleventh;

import java.util.Scanner;

public class AddDigits {
    public static void main (String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program will add up the digits in a number and return the sum.");
        System.out.print("Enter a number between 0 and 1000: ");
        int number = userInput.nextInt();
        int sum;
        if (number == 1000) {
            sum = 1;
        }
        else if (number > 99) {
            sum = number/100 + (number % 100)/10 + (number % 100) % 10;
        } else if (number > 9) {
            sum = number/10 + number % 10;
            }
        else {
            sum = number;
        }
        System.out.println("The sum of the digits in " + number + " is " + sum);
    }
}
