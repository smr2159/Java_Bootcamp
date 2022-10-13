package com.ramsay.atm;

import java.util.Scanner;

public class AtmProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM Program!");
        System.out.println("Enter 1 for withdrawal, 2 for deposit, or 3 to get balance information.");
        System.out.println("If you wish to exit without making a selection enter 4.");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please make your selection now.");
        int userEntry = userInput.nextInt();

        Double balance = 4000.78;
        // If statement for handling user input.
        if (userEntry == 1) {
            System.out.print("Enter withdrawal amount (numbers only): ");
            double userAmount = userInput.nextDouble();
            if (userAmount > balance) {
                System.out.println("You have insufficient funds for this transaction.");
            } else if (userAmount == balance) {
                System.out.println("To withdraw your entire balance and close your account, please visit a branch.");
                }
            else {
                double newBalance = balance - userAmount;
                System.out.println("Please take your cash.");
                System.out.println("Your new balance is: " + "$" + newBalance);
            }
        }
        else if (userEntry == 2) {
            System.out.print("Enter deposit amount (numbers only): ");
            double userAmount = userInput.nextDouble();
            double newBalance = balance + userAmount;
            System.out.println("Your new balance is: " + "$" + newBalance);
        }
        else if (userEntry == 3) {
            System.out.println("Your current balance is: " + "$" + balance);
            }
        else {
            System.out.println("Thank you for using the ATM. Goodbye!");
        }
    }
}
