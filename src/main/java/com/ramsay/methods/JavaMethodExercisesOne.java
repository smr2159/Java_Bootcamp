package com.ramsay.methods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.util.Collections.max;

public class JavaMethodExercisesOne {
    public static void main(String[] args) {
        JavaMethodExercisesOne methods = new JavaMethodExercisesOne();
        System.out.println("Method 1: Subtract 2 numbers (45 and 34).");
        System.out.println(methods.subtractTwoNumbers(45, 34));
        System.out.println("Method 2: Add 2 numbers (23 and 34).");
        System.out.println(methods.addTwoNumbers(23, 34));
        System.out.println("Method 3: Returns True if age is greater than 30 (example 34).");
        System.out.println(methods.isOver30(34));
        System.out.println("Method 4: Says hello to each student.");
        String[] names = {"Sharon", "Beverly", "Susan", "Amber", "Lisa"};
        methods.hello(names);
        int[] numbers = {8, 6, 90, 25, 34, 28};
        System.out.println("Method 5: Returns the sum of the numbers in an array");
        System.out.println(methods.sum(numbers));
        System.out.println("Method 6: Returns day of the week for a number between 1 and 7 (day 2).");
        System.out.println(methods.dayOfWeek(2));
        System.out.println("Method 7: Returns the absolute difference between two numbers (-4 and 14).");
        System.out.println(methods.difference(-4, 14));

        System.out.println("Method 8: Converts text (Hello World) to upperCase.");
        String text = "Hello World";
        System.out.println(methods.upperCase(text));
        System.out.println("Method 9: Return a count of the number of student names in an array.");
        String[] studentNames = {"Sharon", "Beverly", "Susan", "Amber", "Lisa", "Marlene", "Opal", "Gene"};
        System.out.println(methods.numberOfItems(studentNames));
        System.out.println("Method 10: Print all the numbers in an array on a separate line.");
        methods.print(numbers);
        System.out.println("Method 11: Convert 3 numbers to an array of integers.");
        System.out.println(Arrays.toString(methods.toArray(25, 35, 45)));
        System.out.println("Method 12: Return all odd numbers between 1 and a number (25).");
        System.out.println(methods.oddNumbers(25));
        System.out.println("Method 13: Return all even numbers between 1 and a number (30).");
        System.out.println(methods.evenNumbers(30));
        System.out.println("Method 14: Return a count of numbers in an array that are less than 10.");
        System.out.println(methods.lessThan10(numbers));
        System.out.println("Method 15: Return a count of numbers in an array that are greater than 10.");
        System.out.println(methods.greaterThan10(numbers));
        int[] setOne = {8, 6, 32, 90, 25, 34, 28};
        int[] setTwo = {10, 60, 12, 81, 95, 2, 18, 33};
        System.out.println("Method 16: Returns the array with the larger sum.");
        System.out.println(Arrays.toString(methods.larger(setOne, setTwo)));
            }

    // Method 16: Returns the array with the larger sum.
    public int[] larger(int[] setOne, int[] setTwo) {
        int setOneSum = 0;
        int setTwoSum = 0;
        int i;
        int j;
        for (i = 0; i < setOne.length; i++) {
            setOneSum += setOne[i];}
        for (j = 0; j < setTwo.length; j++) {
            setTwoSum += setTwo[j];}
        if (setOneSum > setTwoSum) {
            return setOne;
        }
        else {
            return setTwo;
        }
    }

    // Method 15: Return a count of numbers in an array that are greater than 10.
    public int greaterThan10 (int [] numbers) {
        int count = 0;
        for (int myArrayNumber : numbers) {
            if (myArrayNumber > 10) {
                count += 1;
            }
        }
        return count;
    }

    // Method 14: Return a count of numbers in an array that are less than 10.
    public int lessThan10 (int [] numbers) {
        int count = 0;
        for (int myArrayNumber : numbers) {
            if (myArrayNumber < 10) {
                count += 1;
            }
        }
        return count;
    }

    // Method 13: Return all even numbers between 1 and a number (upperLimit).
    public ArrayList<Integer> evenNumbers (int upperLimit) {
        // Create ArrayList to hold numbers.
        ArrayList<Integer> myEvenNumbers = new ArrayList<Integer>();

        // Loop to add odd numbers to ArrayList.
        for (Integer myNum = 1; myNum <= upperLimit; myNum++) {
            if (myNum % 2 == 0) {
                myEvenNumbers.add(myNum);
            }
        }
        return myEvenNumbers;
    }

    // Method 12: Return all odd numbers between 1 and a number (upperLimit).
    public ArrayList<Integer> oddNumbers (int upperLimit) {
        // Create ArrayList to hold numbers.
        ArrayList<Integer> myOddNumbers = new ArrayList<Integer>();

        // Loop to add odd numbers to ArrayList.
        for (Integer myNumber = 1; myNumber <= upperLimit; myNumber++) {
            if (myNumber % 2 != 0) {
                myOddNumbers.add(myNumber);
            }
        }
        return myOddNumbers;
    }

    // Method 11: Convert 3 numbers to an array of integers.
    public int [] toArray (int numberOne, int numberTwo, int numberThree) {
        int [] myArray = {numberOne, numberTwo, numberThree};

        return myArray;
    }

    // Method 10: Print all the numbers in an array on a separate line.
    public void print(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    // Method 9: Return a count of the number of student names in an array.
    public int numberOfItems(String[] studentNames){
        return studentNames.length;
    }

    // Method 8: Converts text to upperCase.
    public  String upperCase(String text) {
        return text.toUpperCase();
    }

    // Method 7: Returns the absolute difference between two numbers.
    public int difference (int numberOne, int numberTwo) {
        int dif;
        if (numberOne > numberTwo) {
            dif = numberOne - numberTwo;
        }
        else {
            dif = numberTwo - numberOne;
        }
        return dif;
    }

    // Method 6: Returns day of the week for a number between 1 and 7.
    public String dayOfWeek (Integer number) {
       HashMap<Integer, String> weekDay = new HashMap<Integer, String>();
       weekDay.put(1, "Sunday");
       weekDay.put(2, "Monday");
       weekDay.put(3, "Tuesday");
       weekDay.put(4, "Wednesday");
       weekDay.put(5, "Thursday");
       weekDay.put(6, "Friday");
       weekDay.put(7, "Saturday");
       return weekDay.get(number);
      }

    // Method 5: Returns the sum of the numbers provided.
    public int sum(int[] numbers) {
        int sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return sum;
    }

    // Method 4: Says hello to each student.
    public void hello(String[] names) {
        for (String name : names) {
            System.out.println("Hello " + name);
        }
    }

    // Method 3: Returns "True" if age is greater than 30.
    public boolean isOver30(int age) {
        return age > 30;
        }

    // Method 2: Add 2 numbers.
   public int addTwoNumbers(int numberOne, int numberTwo) {
      return numberOne + numberTwo;
   }

    // Method 1: Subtract 2 numbers.
    public int subtractTwoNumbers(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
}

