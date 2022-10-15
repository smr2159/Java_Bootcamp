package com.ramsay.data_structures;

// Import Java utilities
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class EnhancedShoppingCart {
    public static void main(String[] args) {
        // Create ArrayList to hold the products.
        ArrayList<String> products = new ArrayList<>();
        ArrayList<String> purchaseOrder = new ArrayList<String>();
        ArrayList<Double> customerBill = new ArrayList<Double>();
        products.add("EDUC,EDUCATION PRIME SET,384.95,10");
        products.add("CHRI,CHRISTMAS TREE,44.99,7");
        products.add("FREI,FREIGHT TRAIN,199.99,6");
        products.add("STUN,STUNT ARENA,159.99,3");
        products.add("HAND,MATERIAL HANDLER,149.99,2");
        products.add("CAST,CASTLE EXPANSION SET,129.99,7");

        //  Create HashMaps
        HashMap<String, String> productInfo = new HashMap<>();
        HashMap<String, Double> prices = new HashMap<>();
        HashMap<String, Integer> inventory = new HashMap<>();

        // For loop to split items in product list and add them to HashMaps
        for (String line : products) {
            String [] items = line.split(",");
            for (String word : items) {
                String code = items[0];
                String description = items[1];
                Double price = Double.valueOf(items[2]);
                Integer numberAvailable = Integer.valueOf(items[3]);

                productInfo.put(code, description);
                prices.put(code, price);
                inventory.put(code, numberAvailable);
                }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("++ Welcome to Sharon's Lego Store. ++");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println("These are the product codes and names of the lego sets that we have for sale.");
        System.out.println(productInfo);
        System.out.println(" ");
        System.out.println("These are the prices of the lego sets.");
        System.out.println(prices);
        System.out.println(" ");
        System.out.println("Please enter the product code of the lego set you wish to purchase. ");

        // Prompt user for input
        Scanner userInput = new Scanner(System.in);
        String userResponse;

        do {
            System.out.print("Which item do you wish to purchase? ");
            String legoSet = userInput.nextLine().toUpperCase();
            int numberRemaining = inventory.get(legoSet);

            if (productInfo.containsKey(legoSet) && (numberRemaining >= 1)) {
                purchaseOrder.add(legoSet);
                customerBill.add(prices.get(legoSet));
                numberRemaining --;
                inventory.put(legoSet, numberRemaining);
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
        System.out.println(" ");

        System.out.println("You have the following " + items + " items in your cart.");
        System.out.println(purchaseOrder);

        System.out.println(" ");
        System.out.print("Do you wish to remove an item from your cart? ");
        String userAnswer = userInput.nextLine();
        if (userAnswer.equalsIgnoreCase("yes")) {
            System.out.print("Please enter the product code of the item to remove. ");
            String itemToRemove = userInput.nextLine().toUpperCase();
            purchaseOrder.remove(itemToRemove);
            customerBill.remove(prices.get(itemToRemove));
            int numberInStock = inventory.get(itemToRemove);
            numberInStock ++;
            inventory.put(itemToRemove, numberInStock);
        }

        System.out.println(" ");
        TreeSet<String> customerShoppingCart = new TreeSet<>(purchaseOrder);
        System.out.println("You purchased the following items:");
        System.out.println(customerShoppingCart);

        for (Double cost: customerBill) {
            orderTotal += cost;
        }

        System.out.println(" ");
        System.out.printf("The total cost of your order is $%.2f.", orderTotal);
        System.out.println("====================================================");

        System.out.println(" ");
        System.out.println("These are the number of items remaining in stock.");
        System.out.println(inventory);
    }
}
