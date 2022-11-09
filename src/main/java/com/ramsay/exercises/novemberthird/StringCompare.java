package com.ramsay.exercises.novemberthird;

public class StringCompare {
    public static void main (String [] args) {
    String stringOne = "hungry";
    String stringTwo = "Hungry!";

    if (stringOne.equals(stringTwo)) {
            System.out.println("The two strings are exactly the same.");
        }

    else if (stringOne.equalsIgnoreCase(stringTwo)) {
        System.out.println("The two strings have the same value.");
    }

    else {
            System.out.println("The two strings are not the same.");
        }
}
}
