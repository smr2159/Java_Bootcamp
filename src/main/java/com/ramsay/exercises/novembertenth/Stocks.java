package com.ramsay.exercises.novembertenth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Stocks {
    public static void main (String [] args) {
        HashMap <String, Integer> stockPrices = new HashMap<>();
        stockPrices.put("Prudential Public Limited Company", 240);
        stockPrices.put("NextEra Energy, Inc.", 20);
        stockPrices.put("Sphere 3D Corp.", 52);
        stockPrices.put("Conn's, Inc. ", 53);
        stockPrices.put("Merrill Lynch & Co., Inc.", 178);
        stockPrices.put("Tucows Inc.", 215);
        stockPrices.put("TiGenix ", 141);
        stockPrices.put("Navient Corporation", 80);
        stockPrices.put("China Jo-Jo Drugstores, Inc.", 273);
        stockPrices.put("Ciner Resources LP", 252);

        System.out.println(stockPrices);

        ArrayList <Integer> prices = new ArrayList<>();
        int sum = 0;

        for (int stockPrice : stockPrices.values()) {
            sum += stockPrice;
            prices.add(stockPrice);
            if (stockPrice < 50) {

            }

        }
        int average = sum/stockPrices.size();
        System.out.println("The average stock price is $" + average);
    }
}
