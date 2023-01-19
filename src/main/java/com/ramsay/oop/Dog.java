package com.ramsay.oop;

/*
This code sets up the class called Dog with attributes and methodsh.
Created by Sharon M. Ramsay on October 15, 2022.
*/

public class Dog {
    String breed; // The breed of dog
    String color; // The color of the dog's fur
    String size; // The size of the dog - small, medium or large
    int age; // The dog's age in years

    // Create the constructor for the Dog class
    public Dog (String breed, String color, String size, int age) {
        String dogBreed = breed;
        String dogColor = color;
        String dogSize = size;
        int dogAge = age;
    }

    public static void main (String [] args) {
        // Create an instance of the Dog class
        Dog Lassie = new Dog("German Shepard", "brown", "large", 10);
        Lassie.breed = "German Shepard";
        Lassie.eat();
        Lassie.run();
        Lassie.sit();
        Lassie.sleep();
    }

    public void eat () {
        System.out.println("The " + breed + " is eating.");
    }

    public void sit () {
        System.out.println("The " + breed + " is sitting.");
    }

    public void sleep () {
        System.out.println("The " + breed + " is sleeping.");
    }

    public void run () {
        System.out.println("The " + breed + " is running.");
    }

}