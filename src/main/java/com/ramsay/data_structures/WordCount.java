package com.ramsay.data_structures;

// This program is a practice session of the use of HashSet and HashMap.
// Created by Sharon M. Ramsay on October 8, 2022

// Import Java utilities
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class WordCount {
    public static void main(String[] args) {
        // ArrayList to hold the sentences given.
        ArrayList<String> sentences = new ArrayList<>();
        sentences.add("Nothing is so necessary for a young man as the company of intelligent women");
        sentences.add("The strongest of all warriors are these two Time and Patience");
        sentences.add("If everyone fought for their own convictions there would be no war");
        sentences.add("There is no greatness where there is not simplicity goodness and truth");
        sentences.add("A limit has been set to human life which cannot be overstepped");
        sentences.add("Well what makes you go to war");

        // ArrayList to hold the words in the sentences.
        ArrayList<String> wordList = new ArrayList<>();

        // For loop to break sentences into words, add the words to the wordList, and count the number of words.
        int wordCount = 0;
        for (String line : sentences) {
            String [] words = line.split(" ");
            for (String word : words) {
                wordList.add(word);
                wordCount++;
            }
        }
        System.out.println("The total number of words is: " + wordCount);

        // Create a HashMap to store the number of occurrence of each unique word (case-sensitive).
        HashMap<String, Integer> myWordCount = new HashMap<>();

        // For loop to add word and word count to the HashMap.
        for (String word : wordList) { // For each word in the wordList
            Integer myCount = myWordCount.get(word); // Check the HashMap for the word
            if (myCount == null) { // If the word is not in the HashMap - set the count to 0
                myCount = 0;
            }

            // Add the word to the HashMap and increment the count by 1.
            myCount += 1;
            myWordCount.put(word, myCount); // Put method will replace old count with new count for repeats of the word
        }

        // Create and manipulate a TreeSet.
        TreeSet<String> alphaWordList = new TreeSet<>();
        System.out.println("This is an alphabetical list of the words in the word list (upper- then lower-case):");
        System.out.println(alphaWordList);
        System.out.println("The first word in the list is: " + alphaWordList.first());
        System.out.println("The last word in the list is: " + alphaWordList.last());
    }

}
