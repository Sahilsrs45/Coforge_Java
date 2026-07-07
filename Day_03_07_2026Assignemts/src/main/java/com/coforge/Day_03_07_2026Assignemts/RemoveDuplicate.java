package com.coforge.Day_03_07_2026Assignemts;

public class RemoveDuplicate {

	    public static void main(String[] args) {

	        int arr[] = {1, 2, 3, 2, 4, 1, 5, 3};

	        System.out.print("Array after removing duplicates: ");

	        for (int i = 0; i < arr.length; i++) {

	            boolean isDuplicate = false;

	            // Check if current element already appeared
	            for (int j = 0; j < i; j++) {

	                if (arr[i] == arr[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	

}
