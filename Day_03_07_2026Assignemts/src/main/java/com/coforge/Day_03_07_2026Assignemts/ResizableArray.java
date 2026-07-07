package com.coforge.Day_03_07_2026Assignemts;


public class ResizableArray {

    public static void main(String[] args) {

        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println("Original Array:");

        for (int num : arr)
            System.out.print(num + " ");

        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[3] = 40;
        newArr[4] = 50;

        System.out.println("\nResized Array:");

        for (int num : newArr)
            System.out.print(num + " ");
    }
}