package com.ramsay.exercises.novemberthird;

import java.util.Arrays;

public class StringComparison {

    public static void main(String[] args) {
        String [] names = {"tiger", "giraffe", "cat", "dog", "lion"};
        int n = names.length;
            for (int i=1 ;i<n; i++) {
                String temp = names[i];

                int j = i - 1;
                while (j >= 0 && temp.length() < names[j].length())
                {
                    names[j+1] = names[j];
                    j--;
                }
                names[j+1] = temp;
            }
            System.out.println(names[n-1]);
        }

    }


    /*
        Write a method that finds the longest string in any given array.
        sample data to call the method with
        i.e. [] -> ""
        i.e.  -> lion and tiger
        i.e. ["word", "count", "diamond", "blue", "green"] -> diamond
        i.e. ["board", "jack", "java", "oop", "spring"] -> board
    */
