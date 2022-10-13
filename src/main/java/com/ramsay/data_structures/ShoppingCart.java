package com.ramsay.data_structures;

// This is a "shopping cart" program which makes use of HashMap and ArrayList.
// Version 1.0; created by Sharon M Ramsay, October 1, 2022.

// Import Java utilities
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Welcome to Sharon's Lego Store!");
        System.out.println("These are the lego sets that we have for sale (price in $):");

        // HashMap to hold the list of lego sets and prices
        HashMap<String, Double> legos = new HashMap<String, Double>();
        legos.put("EDUCATION PRIME SET", 384.95);
        legos.put("CHRISTMAS TREE", 44.99);
        legos.put("FREIGHT TRAIN", 199.99);
        legos.put("STUNT ARENA", 159.99);
        legos.put("MATERIAL HANDLER", 149.99);
        legos.put("CASTLE EXPANSION SET", 129.99);

        // Print the list
        System.out.println(legos);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        // Create ArrayList to hold user input.
        ArrayList<String> purchaseOrder = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();

        Scanner userInput = new Scanner(System.in);
        String userResponse;

        do {
            System.out.print("Which item do you wish to purchase? ");
            String legoSet = userInput.nextLine().toUpperCase();

            if (legos.containsKey(legoSet)) {
                purchaseOrder.add(legoSet);
                prices.add(legos.get(legoSet));
            }
            else {
            System.out.println("Sorry, we do not have that item available.");
            }
            System.out.print("Do you wish to purchase another item? ");
            userResponse = userInput.nextLine();
        }
        while (userResponse.equalsIgnoreCase("yes"));

        Double orderTotal = 0.00;
        int items = purchaseOrder.size();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        System.out.println("You have the following " + items + " items in your cart.");
        System.out.println(purchaseOrder);

        for (Double cost: prices) {
            orderTotal += cost;
        }
        System.out.printf("The total cost of your order is $%.2f.", orderTotal);
        }
}
