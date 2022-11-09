package com.ramsay.exercises.novembersecond;

public class ExerciseC {
    public static void main(String[] args) {
        // create a random integer variable
        int randomNumOne = (int) ((Math.random() * (10-1)) + 1);

        // create a second random integer variable
        int randomNumTwo = (int) ((Math.random() * (100-1)) + 1);

        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if (randomNumOne == randomNumTwo) {
           System.out.println("The two numbers are the same.");
        }
        else {
            System.out.println("The two numbers are " + randomNumOne + " and " + randomNumTwo + " - they are not the same.");
        }
    }
}
