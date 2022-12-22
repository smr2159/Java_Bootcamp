package com.ramsay.exercises.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/*
Write a  program that takes an array of integers,
filters only even numbers, multiplies them by 2,
and prints them as a result.
 */

public class ExerciseTwo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(7, 8, 12, 41, 13, 98, 12, 18, 15, 72, 65, 90, 39, 40, 81, 10);
        List<Integer> doubled = number.stream().filter(num -> num % 2 == 0).map(x -> x*2).sorted().collect(toList());
        System.out.println(doubled);
    }
}
