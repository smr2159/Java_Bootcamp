package com.ramsay.exercises.novemberfifth;

import java.util.ArrayList;

public class AddressBook {
    public static void main (String [] args) {


    }

    public ArrayList addContact (String contact) {
        ArrayList <String> addressBook = new ArrayList<>();
        addressBook.add(contact);
        return addressBook;
    }

    public String findContact (String lastName, ArrayList addressBook) {
        for (String line : addressBook) {
            String[] contact = line.split(",");
            String lastName = addressBook[1];
            if (addressBook.get(lastName) = lastName) {
                return line;
            }

    }
        return line;
}
