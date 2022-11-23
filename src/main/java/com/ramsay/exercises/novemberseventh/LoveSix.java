package com.ramsay.exercises.novemberseventh;

// CodingBat Exercise: https://codingbat.com/prob/p137742

public class LoveSix {
    public static void main (String [] args) {
        LoveSix weLoveSix = new LoveSix();
        System.out.println(weLoveSix.loveSix(11, 8));
    }

    public boolean loveSix (int a, int b) {
        boolean answer;
        if ((a == 6) || (b == 6) || (a + b == 6) || (a - b == 6) || (b - a == 6)) {
           answer = true;
        }

        else {
            answer = false;
        }
        return answer;
    }

}
