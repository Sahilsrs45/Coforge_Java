package com.coforge.Day_06_07_2026prj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // put()
        map.put(1, "apple");
        map.put(12, "orange");
        map.put(14, "banana");
        map.put(10, "watermelon");
        map.put(24, "pineapple");
        map.put(54, "apple");

        System.out.println("Original Map : " + map);

        // keySet()
        System.out.println("\nKeys : " + map.keySet());

        // values()
        System.out.println("Values : " + map.values());

        // entrySet()
        System.out.println("Entries : " + map.entrySet());

        // containsKey()
        System.out.println("\nContains Key 10 : " + map.containsKey(10));

        // containsValue()
        System.out.println("Contains Value orange : " + map.containsValue("orange"));

        // get()
        System.out.println("Value of key 14 : " + map.get(14));

        // getOrDefault()
        System.out.println("Key 25 : " + map.getOrDefault(25, "No Fruit"));

        // putIfAbsent()
        map.putIfAbsent(25, "Guava");
        System.out.println("\nAfter putIfAbsent : " + map);

        // replace()
        map.replace(25, "Mango");
        System.out.println("After replace : " + map);

        // replace(key, oldValue, newValue)
        map.replace(25, "Mango", "Guava");
        System.out.println("After replace(old,new) : " + map);

        // null key and null value
        map.put(null, null);
        map.put(101, null);

        System.out.println("\nAfter inserting nulls : " + map);

        System.out.println("Value of null key : " + map.get(null));

        // size()
        System.out.println("\nSize : " + map.size());

        // isEmpty()
        System.out.println("Is Empty : " + map.isEmpty());

        // entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        System.out.println("\nTraversing using Iterator");

        Iterator<Map.Entry<Integer, String>> itr = entries.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> e = itr.next();
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // forEach()
        System.out.println("\nTraversing using forEach");

        map.forEach((k, v) -> System.out.println(k + " : " + v));

        // remove(key)
        map.remove(101);
        System.out.println("\nAfter remove(101) : " + map);

        // remove(key,value)
        map.remove(25, "Guava");
        System.out.println("After remove(25,\"Guava\") : " + map);

        // replaceAll()
        map.replaceAll((k, v) -> (v == null) ? "Empty" : v.toUpperCase());
        System.out.println("\nAfter replaceAll : " + map);

        // clone()
        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) map.clone();
        System.out.println("\nCloned Map : " + cloneMap);

        // clear()
        cloneMap.clear();
        System.out.println("After clear() Clone : " + cloneMap);
        System.out.println("Clone is Empty : " + cloneMap.isEmpty());

        // ====================================================
        // LinkedHashMap
        // ====================================================

        System.out.println("\n========== LinkedHashMap ==========");

        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();

        lmap.put(101, "Java");
        lmap.put(102, "Python");
        lmap.put(103, "C");
        lmap.put(104, "C++");
        lmap.put(105, "JavaScript");

        System.out.println("LinkedHashMap : " + lmap);

        System.out.println("Keys : " + lmap.keySet());

        System.out.println("Values : " + lmap.values());

        System.out.println("Entries : " + lmap.entrySet());

        System.out.println("Contains Key 103 : " + lmap.containsKey(103));

        System.out.println("Contains Value Java : " + lmap.containsValue("Java"));

        System.out.println("Get 104 : " + lmap.get(104));

        lmap.putIfAbsent(106, "SQL");

        lmap.replace(103, "C Language");

        lmap.remove(102);

        System.out.println("After modifications : " + lmap);

        System.out.println("\nTraversing LinkedHashMap");

        for (Map.Entry<Integer, String> e : lmap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("Size : " + lmap.size());

        lmap.clear();

        System.out.println("After clear : " + lmap);

        System.out.println("Is Empty : " + lmap.isEmpty());

    }
}