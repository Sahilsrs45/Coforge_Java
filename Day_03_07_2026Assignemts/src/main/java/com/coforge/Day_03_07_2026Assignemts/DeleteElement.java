package com.coforge.Day_03_07_2026Assignemts;

public class DeleteElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int deleteIndex = 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {

            if (i == deleteIndex)
                continue;

            newArr[j++] = arr[i];
        }

        for (int num : newArr)
            System.out.print(num + " ");
    }
}
