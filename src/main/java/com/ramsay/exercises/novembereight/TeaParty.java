package com.ramsay.exercises.novembereight;
// Coding Bat Exercise: https://codingbat.com/prob/p177181

public class TeaParty {
    public static void main (String [] args) {
        TeaParty evalParty = new TeaParty();
        System.out.println(evalParty.teaParty(20, 8));
    }

    public String teaParty (int T, int C) { // T - tea and C - candy
        String result = null;
        if ((T < 5) || (C < 5) ) {
            result = "0 - This party is going to be bad!";
        }
        else if ((C >= 2*T) || (T >= 2*C)) {
            result = "2 - This is going to be a great party!";
        }
        else if ((C >= 5) && (T >= 5)) {
            result = "1 - This is going to be a good party!";
        }
        return result;
    }
}
