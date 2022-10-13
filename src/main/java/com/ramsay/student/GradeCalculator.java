package com.ramsay.student;

// Import Java utilities
import java.util.ArrayList;
import java.util.Scanner;

// This is a program that will calculate the average grade based on user input.
// Version 1.0; created by Sharon M Ramsay, October 1, 2022.

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the student Grade Calculator!");
        System.out.print("How many grades do you wish to enter? ");

        // Prompt user for input.
        Scanner userInput = new Scanner(System.in);
       Integer numberOfGrades = userInput.nextInt();

        // Create ArrayList to hold user input.
        ArrayList<Integer> grades = new ArrayList<Integer>();

        // Loop to add grades to ArrayList.
        for (Integer i = 0; i < numberOfGrades; i++) {
            System.out.print("Please enter a grade: ");
            int grade = userInput.nextInt();
            grades.add(grade);
       }
        int sum = 0;
        int average = 0;
        for (int grade : grades) {
            sum += grade;
        }
        int numberGrades = grades.size();
        average = sum/numberGrades;
        System.out.println("The average grade is " + average);
    }
}

