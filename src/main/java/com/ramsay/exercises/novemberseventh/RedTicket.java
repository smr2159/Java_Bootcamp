package com.ramsay.exercises.novemberseventh;

public class RedTicket {
    public static void main (String [] args) {
        RedTicket evalTicket = new RedTicket();
        System.out.println(evalTicket.redTicket(2, 2, 1));
        }

        public int redTicket (int a, int b, int c) {
        int ticketValue;
        if ((a == 2) && (b == 2) && (c == 2)) {
            ticketValue = 10;
        }
        else if ((a == 1) && (b == 1) && (c == 1)) {
                ticketValue = 5;
            }
        else if ((a == 0) && (b == 0) && (c == 0)) {
            ticketValue = 5;
        }
        else if ((a != b) && (a != c)) {
            ticketValue = 1;
        }
        else {
            ticketValue = 0;
        }
        return ticketValue;
        }
    }


