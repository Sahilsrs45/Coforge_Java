package com.coforge.Day_07_07_2026Assignments;

public class Product {

    int stock = 10;

    public void purchase(int quantity){

        if (quantity > stock)
            throw new StockOutOfException("Stock Not Available.");

        stock -= quantity;

        System.out.println("Purchase Successful.");
        System.out.println("Remaining Stock : " + stock);

    }

}