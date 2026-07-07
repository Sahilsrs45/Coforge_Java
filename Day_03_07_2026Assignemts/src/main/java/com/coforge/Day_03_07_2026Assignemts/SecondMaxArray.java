package com.coforge.Day_03_07_2026Assignemts;

public class SecondMaxArray {
	
	    public static void main(String[] args) {

	        int arr[] = {20, 50, 10, 70, 60};

	        int max = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        for (int num : arr) {

	            if (num > max) {

	                second = max;
	                max = num;
	            } else if (num > second && num != max) {

	                second = num;
	            }
	        }

	        System.out.println("Second Maximum = " + second);
	    }
	

}
