package com.ramsay.student;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchGrades {
    public static void main(String[] args) {
        // Declare and initialize arrays for students' grades.
        int [] studentOneGrades = {78, 89, 78, 80};
        int [] studentTwoGrades = {78, 67, 68, 92};
        int [] studentThreeGrades = {88, 92, 92, 94};

        // Declare and initialize array for students.
        String [] students = {"Student One", "Student Two", "Student Three"};

        // Declare and initialize an int array for grades.
        int [] grades = null;

        // Prompt the user to pick a student.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Student names: " + Arrays.toString(students));
        System.out.print("Enter a student's name: ");
        String student = userInput.nextLine();

        // Set grades variable based on selected student.
        if (student.equalsIgnoreCase("Student One")) {
            grades = studentOneGrades;
        }
        else if (student.equalsIgnoreCase("Student Two")) {
            grades = studentTwoGrades;
        }
        else if (student.equalsIgnoreCase("Student Three")) {
            grades = studentThreeGrades;
        }
        else {
            System.out.println("There is no student with that name. Goodbye!");
        }

        // Calculate student grade.
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        double numberOfGrades = grades.length;
        double average = sum/numberOfGrades;

        char studentAvg;
        if (average >= 90) {
            studentAvg = 'A';
        }
        else if (average >= 80) {
            studentAvg = 'B';
        }
        else if (average >= 70) {
            studentAvg = 'C';
        }
        else if (average >= 60) {
            studentAvg = 'D';
        }
        else {
            studentAvg = 'F';
        }


        // Switch statement
        String comment;
        switch (studentAvg){
            case 'A': comment = "Excellent!";
                    break;
            case 'B': comment = "Well Done!";
                break;
            case 'C': comment = "You Passed";
                break;
            case 'D': comment = "Try Again";
                break;
            case 'F': comment = "Try Again";
                break;
            default: comment = "Invalid Grade";
        }
    System.out.println("The student's average is: " + average);
    System.out.println(comment);

    }
}
