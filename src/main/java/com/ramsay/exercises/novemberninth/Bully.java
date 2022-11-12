package com.ramsay.exercises.novemberninth;
// Coding Bat Exercise: https://codingbat.com/prob/p197888

import java.util.HashMap;

public class Bully {
    public static void main (String [] args) {
        HashMap<String, String> bully = new HashMap<String, String>();
        bully.put("a", "candy");
        bully.put("b", "carrot");
        bully.put("c", "meh");

        Bully myMapBully = new Bully();
        System.out.println(myMapBully.mapBully(bully));

    }

    public HashMap <String, String> mapBully (HashMap <String, String> bully) {
        if (bully.get("a") != null) {
            bully.put("b", bully.get("a"));
            bully.put("a", "  ");

        }
        return bully;
     }

}
