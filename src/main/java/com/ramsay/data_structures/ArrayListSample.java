package com.ramsay.data_structures;
import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {

        // create a list
        ArrayList<String> names = new ArrayList<>();

        // add items to the list
        names.add("John");
        names.add("Mary");
        names.add("Sara");

        System.out.println("Names : " + names);

        // get the size of a list
        System.out.println("Number of Names : " + names.size());

        // get an item from the list based on an index
        System.out.println("Element At Index end is " + names.get(names.size()-1));

        // remove an item from the list based on an index
        System.out.println("Removed Element At Index 1: " + names.remove(1));

        // remove an item from the list based on a value
        System.out.println("Removed Sara: " + names.remove("Sara"));

        System.out.println("Remaining Names : " + names);

        // get the size of a list
        System.out.println("Number of Remaining Names : " + names.size());

        // iterate over a list
        for(String name :names) {
            System.out.println("Name : " + name);
        }
    }
}

