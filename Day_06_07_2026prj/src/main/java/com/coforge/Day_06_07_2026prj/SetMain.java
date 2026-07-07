package com.coforge.Day_06_07_2026prj;

import java.util.HashSet;

public class SetMain {

    public static void main(String[] args) {

        HashSet<Integer> hset = new HashSet<Integer>();

        hset.add(67);
        hset.add(12);
        hset.add(45);
        hset.add(1);
        hset.add(56);
        hset.add(12);
        hset.add(60);
        hset.add(12);
        hset.add(null);

        System.out.println("HashSet : " + hset);

        // isEmpty()
        System.out.println("Is Empty : " + hset.isEmpty());

        // size()
        System.out.println("Size : " + hset.size());

        // contains()
        System.out.println("Contains 45 : " + hset.contains(45));

        HashSet<Integer> hset1 = new HashSet<Integer>();

        hset1.add(65);
        hset1.add(15);
        hset1.add(40);
        hset1.add(19);
        hset1.add(56);
        hset1.add(16);
        hset1.add(60);
        hset1.add(12);

        System.out.println("Second HashSet : " + hset1);

        // containsAll()
        System.out.println("Contains All : " + hset.containsAll(hset1));

        // addAll() (Union)
        HashSet<Integer> union = new HashSet<Integer>(hset);
        union.addAll(hset1);
        System.out.println("After addAll() : " + union);

        // retainAll() (Intersection)
        HashSet<Integer> intersection = new HashSet<Integer>(hset);
        intersection.retainAll(hset1);
        System.out.println("After retainAll() : " + intersection);

        // removeAll() (Difference)
        HashSet<Integer> difference = new HashSet<Integer>(hset);
        difference.removeAll(hset1);
        System.out.println("After removeAll() : " + difference);

        // remove()
        hset.remove(45);
        System.out.println("After remove(45) : " + hset);

        // toArray()
        Object[] obj = hset.toArray();

        System.out.println("\nObject Array");
        for (Object i : obj)
            System.out.println(i);

        // toArray(T[])
        Integer[] arr = hset.toArray(new Integer[0]);

        System.out.println("\nInteger Array");
        for (Integer i : arr)
            System.out.println(i);

        // clone()
        HashSet<Integer> clone = (HashSet<Integer>) hset.clone();
        System.out.println("\nCloned HashSet : " + clone);

        // clear()
        clone.clear();
        System.out.println("After clear() : " + clone);
        System.out.println("Clone is Empty : " + clone.isEmpty());

        // for-each traversal
        System.out.println("\nTraversing HashSet");
        for (Integer i : hset) {
            System.out.println(i);
        }
    }
}