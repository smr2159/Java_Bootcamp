package com.ramsay.exercises.novembereight;
//Coding Bat Exercise: https://codingbat.com/prob/p164144

import java.util.ArrayList;

public class PostFour {
    public static void main (String[] args) {
        int [] numbers = {4, 4, 1, 2, 3};
        PostFour results = new PostFour();
        System.out.println(results.postFour(numbers));
    }
    public ArrayList postFour(int [] numbers) {
        ArrayList afterFour = new ArrayList<>();
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] != 4) {
                afterFour.add(numbers[i]);

            }
        }
        return afterFour;
    }
}
