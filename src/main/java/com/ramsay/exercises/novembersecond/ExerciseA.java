package com.ramsay.exercises.novembersecond;

import java.util.Arrays;

public class ExerciseA {

   public static void main(String[] args) {
       // declare an empty integer array of length = 4
       int[] myNumbers = new int[4];

       // fill it with the number `3`
       for (int i = 0; i < 4; i++) {
           myNumbers[i] = 3;
       }
       System.out.println(Arrays.toString(myNumbers));
       }
}
