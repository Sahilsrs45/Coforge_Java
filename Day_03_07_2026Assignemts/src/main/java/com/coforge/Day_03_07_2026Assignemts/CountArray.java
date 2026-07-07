package com.coforge.Day_03_07_2026Assignemts;

public class CountArray {
	    public static void main(String[] args) {

	        int arr[] = {2, 3, 5, 2, 4, 2, 6};
	        int key = 2;
	        int count = 0;

	        for (int num : arr) {

	            if (num == key)
	                count++;
	        }

	        System.out.println("Count = " + count);
	    }
	

}
