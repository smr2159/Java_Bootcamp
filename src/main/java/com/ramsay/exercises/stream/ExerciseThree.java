package com.ramsay.exercises.stream;

/*
Write a program that takes a list of strings,
counts all the elements whose length is greater than 5,
and returns the final count.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseThree {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("zebra", "cat", "dog", "donkey", "racoon", "hippopotamus", "squirrel");
        List<String> longName = animals.stream().filter(animal -> animal.length() > 5).sorted().collect(Collectors.toList());
        System.out.println(longName.size());
    }
}
