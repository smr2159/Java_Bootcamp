package com.ramsay.exercises.novembereleventh;

import java.util.Scanner;

public class Minutes {
    public static void main (String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("This program will convert minutes entered into years and days.");
        System.out.print("Enter the number of minutes: ");
        int minutes = userInput.nextInt();

        int years = minutes/525960;
        int days = (minutes % 525960)/1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
