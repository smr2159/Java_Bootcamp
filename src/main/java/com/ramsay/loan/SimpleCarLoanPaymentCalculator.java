package com.ramsay.loan;

public class SimpleCarLoanPaymentCalculator {
    public static void main (String[] args) {
        double initialCarLoan = 20000;
        int loanLength = 36; // Length of the loan in months
        double interestRate = 0.03;
        double downPayment = 3000;

        double startingBalance = initialCarLoan - downPayment;
        double principal = startingBalance/loanLength;
        double interest = interestRate * principal;
        double monthlyPayment = principal + interest;
        System.out.printf("Your monthly payment for this car loan is $%.2f", monthlyPayment);
    }
}
