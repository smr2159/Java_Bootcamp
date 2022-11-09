package com.ramsay.exercises.novemberthird;

// Method to find the longest word given an array of strings.

public class LongestWord {

    public  static  void main (String [] args) {
        String[] words = {"tiger",  "cat", "giraffe", "dog", "lion", "hippopotamus"};
        LongestWord stringCompare = new LongestWord();
        System.out.println(stringCompare.findLongestWord(words));

    }

    public String findLongestWord (String [] words) {
        int n = words.length;
        String longestWord = null;

        for (int i = 1; i < n; i++) {
            String wordOne = words[0];
            int wordOneLength = words[0].length();
            if (words[i].length()>wordOneLength) {
                longestWord = words[i];
            }
        }

        return longestWord;
    }
}
