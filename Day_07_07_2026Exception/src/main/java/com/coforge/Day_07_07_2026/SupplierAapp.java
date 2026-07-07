package com.coforge.Day_07_07_2026;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Item {

    private int id;
    private String name;

    public Item() {
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + "]";
    }
}

public class SupplierAapp {

    public static void main(String[] args) {

        // Random Number Supplier
//        Supplier<Integer> supplier = () -> (int) (Math.round(Math.random() * 10000));
//        System.out.println(supplier.get());

        // Current Date-Time Supplier
//        Supplier<LocalDateTime> timeSupplier = () -> LocalDateTime.now();
//        System.out.println(timeSupplier.get());

        // Item List
        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item(101, "Laptop"));
        itemList.add(new Item(102, "Mouse"));
        itemList.add(new Item(103, "Keyboard"));
        itemList.add(new Item(104, "Monitor"));
        itemList.add(new Item(105, "Printer"));

        System.out.println("Item List:");

        for (Item item : itemList) {
            System.out.println(item);
        }

        // Supplier of Item
        Supplier<Item> itemSupplier = () -> new Item(106, "Scanner");

        System.out.println("\nSupplier Item:");
        System.out.println(itemSupplier.get());
    }
}