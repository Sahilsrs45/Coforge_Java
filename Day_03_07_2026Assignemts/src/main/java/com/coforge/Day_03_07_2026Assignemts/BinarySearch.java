package com.coforge.Day_03_07_2026Assignemts;

import java.util.Scanner;

public class BinarySearch {
	 public static void main(String[] args) {
		 
		 
            Scanner sc=new Scanner(System.in);
	        int arr[] = {10, 20, 30, 40, 50, 60};
	        System.out.print("Enter the key value which you want to search :");
	        int key = sc.nextInt();

	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {

	            int mid = (low + high) / 2;

	            if (arr[mid] == key) {
	                System.out.println(arr[mid]+" Element found at index " + mid);
	                return;
	            }

	            if (key < arr[mid])
	                high = mid - 1;
	            else
	                low = mid + 1;
	        }

	        System.out.println("Element not found");
	    }

}
