package com.coforge.Day_06_07_2026prj;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {

        TreeMap<Integer, Product> prod = new TreeMap<Integer, Product>();

        prod.put(101, new Product(101, "Laptop", 65000, 10));
        prod.put(102, new Product(102, "Mouse", 800, 50));
        prod.put(103, new Product(103, "Keyboard", 1500, 30));
        prod.put(104, new Product(104, "Monitor", 12000, 15));
        prod.put(105, new Product(105, "Printer", 9500, 8));
        prod.put(106, new Product(106, "Scanner", 7000, 12));
        prod.put(107, new Product(107, "Speaker", 2500, 20));
        prod.put(108, new Product(108, "Webcam", 3000, 18));
        prod.put(109, new Product(109, "Hard Disk", 5500, 25));
        prod.put(110, new Product(110, "Pendrive", 700, 60));

        System.out.println("Product Map:");

        for (Map.Entry<Integer, Product> entry : prod.entrySet()) {
            System.out.println("Key = " + entry.getKey() + "  Value = " + entry.getValue());
            
            
        Set<Integer> set=prod.descendingKeySet();
        for(Integer s:set) {
        	System.out.println(s);
        }
        }
    }
}