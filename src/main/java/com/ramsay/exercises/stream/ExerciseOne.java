package com.ramsay.exercises.stream;

/*
Write a program that will take an array of strings, go through all the elements,
select only those longer than five characters, and sort and return them as a new list.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseOne {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("zebra", "cat", "dog", "donkey", "racoon", "hippopotamus", "squirrel");
        List<String> longName = animals.stream().filter(animal -> animal.length() > 5).sorted().collect(Collectors.toList());
        System.out.println(longName);
    }
}
