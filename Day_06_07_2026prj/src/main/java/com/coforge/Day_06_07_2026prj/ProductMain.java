package com.coforge.Day_06_07_2026prj;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductMain {

    public static void main(String[] args) {

//        TreeSet<Product> products = new TreeSet<>();
//
//        products.add(new Product(101, "Laptop", 65000, 10));
//        products.add(new Product(102, "Mouse", 800, 50));
//        products.add(new Product(103, "Keyboard", 1500, 30));
//        products.add(new Product(104, "Monitor", 12000, 15));
//        products.add(new Product(105, "Printer", 9500, 8));
//        products.add(new Product(106, "Scanner", 7000, 12));
//        products.add(new Product(107, "Speaker", 2500, 20));
//        products.add(new Product(108, "Webcam", 3000, 18));
//        products.add(new Product(109, "Hard Disk", 5500, 25));
//        products.add(new Product(110, "Pendrive", 700, 60));
//
//        System.out.println("Product Details:");
//
//        for (Product p : products) {
//            System.out.println(p);
//        }
//        
        
        TreeSet<Integer> tree=new TreeSet<Integer>();
        
        tree.add(54);
        tree.add(85);
        tree.add(84);
        tree.add(63);
        tree.add(29);
        tree.add(75);
        tree.add(52);
        tree.add(58);
        tree.add(99);
        tree.add(69);
        System.out.println(tree);
        
        Set<Integer> set=tree.descendingSet();
        System.out.println("in descending order:");
        System.out.println(set);
        
        Iterator<Integer> itr=tree.descendingIterator();
        while(itr.hasNext())
        	System.out.println(itr.next());
        
        
        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());
        System.out.println(tree.ceiling(69));
        System.out.println(tree.floor(75));
        System.out.println(tree.higher(29));
        System.out.println(tree.lower(75));
        
    }
}