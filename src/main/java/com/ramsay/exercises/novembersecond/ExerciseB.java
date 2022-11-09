package com.ramsay.exercises.novembersecond;

import java.util.Arrays;

public class ExerciseB {
    public static void main(String[] args) {
        // fill it with the number `3`

        // declare an empty integer array of length = 7
        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++) {
            numbers[i] = 2;
        }
        numbers[1] = 23;
        System.out.println(Arrays.toString(numbers));
    }
}
