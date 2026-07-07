package com.coforge.Day_03_07_2026Assignemts;

public class InsertElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int position = 2;
        int value = 25;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++)
            newArr[i] = arr[i];

        newArr[position] = value;

        for (int i = position; i < arr.length; i++)
            newArr[i + 1] = arr[i];

        for (int num : newArr)
            System.out.print(num + " ");
    }
}
