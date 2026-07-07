package com.coforge.Day_07_07_2026Assignments;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        try {

            System.out.print("Enter Product Quantity: ");
            int qty = sc.nextInt();

            p.purchase(qty);

        } catch (StockOutOfException e) {

            System.out.println("Exception: " + e.getMessage());

        }

        sc.close();
    }

}