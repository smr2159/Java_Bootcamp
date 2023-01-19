package com.ramsay.data_structures;
import java.util.HashMap;

public class HashMapSample {

    public static void main(String[] args) {

        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> grades = new HashMap<>();

        // Adding elements to the Map
        grades.put("John", 89);
        grades.put("Sara", 76);
        grades.put("Mary", 92);

        // Print size of the map
        System.out.println("The number of student grades :  "
                + grades.size());

        // Printing elements in object of Map
        System.out.println("Student Grades " + grades);

        // Checking if a key is present and if
        // print the value for the element
        // random element
        if (grades.containsKey("John")) {

            // Mapping
            Integer grade = grades.get("John");

            // Printing value for the corresponding key
            System.out.println("John's grade is " + grade);
        }

        // Remove an element from the map
        System.out.println("John withdrew from the class with a grade of " + grades.remove("John"));

        // Printing elements in object of Map
        System.out.println("Remaining Student Grades " + grades);
    }

}
