package com.ramsay.data_structures;

// Import Java utilities
import java.util.ArrayList;
import java.util.HashMap;

public class EnhancedShoppingCart {
    public static void main(String[] args) {
        // Create ArrayList to hold the products.
        ArrayList<String> products = new ArrayList<>();
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
        System.out.println("These are the lego sets that we have for sale.");
        System.out.println(productInfo);
        System.out.println(" ");
        System.out.println("Please enter the name of the lego set you wish to purchase. ");
        System.out.println(prices);
        System.out.println(inventory);
    }

}
