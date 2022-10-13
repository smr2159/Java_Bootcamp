package com.ramsay.atm;

import java.util.Scanner;

public class SwitchATM {
    double balance = 4000.78;

    public static void main(String[] args) {
        double balance = 4000.78;

        System.out.println("Welcome to the ATM Program!");
        System.out.println("Enter 1 for withdrawal, 2 for deposit, or 3 to get balance information.");
        System.out.println("If you wish to exit without making a selection enter 4.");

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please make your selection now. ");
        int userEntry = userInput.nextInt();

        // Switch statement
        String comment;
        switch (userEntry) {
            case 1:
                comment = "Enter withdrawal amount (numbers only): ";
                break;
            case 2:
                comment = "Enter deposit amount (numbers only): ";
                break;
            case 3:
                comment = "Please wait while we process your transaction.";
                break;
            case 4:
                comment = "Thank you for using the ATM. Goodbye!";
                break;
            default:
                comment = ":)";
        }

        // Provide user a response based on user entry.
        System.out.println(comment);

        // Run method for the ATM program.
        SwitchATM methods = new SwitchATM();
        if (userEntry == 1) {
            methods.withdrawal();
        }
        else if (userEntry == 2) {
            methods.deposit();
        }
        else if (userEntry == 3) {
            System.out.printf("Your new balance is $%.2f", balance);
        }
    }
    Scanner userInput = new Scanner(System.in);
    public void withdrawal () {
        double userAmount = userInput.nextDouble();
        if (userAmount > balance) {
            System.out.println("You have insufficient funds for your transaction.");
        } else if (userAmount == balance) {
            System.out.println("If you wish to close your account, please visit a branch teller.");
        } else if (userAmount > 500) {
            System.out.println("You have exceeded the daily withdrawal limit of $500.");
        } else {
            double newBalance = balance - userAmount;
            System.out.printf("Your new balance is $%.2f", newBalance);
        }
    }
        public void deposit () {
            double userAmount = userInput.nextDouble();
            double newBalance = balance + userAmount;
            System.out.printf("Your new balance is $%.2f", newBalance);
        }
    }
