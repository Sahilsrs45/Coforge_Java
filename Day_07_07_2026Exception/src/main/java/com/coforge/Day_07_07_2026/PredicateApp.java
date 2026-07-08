package com.coforge.Day_07_07_2026;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {23,12,56,33,45,65,87,90,66};
		List<Integer> list=Arrays.asList(arr);
		Predicate<Integer> predicate=(n)->n%2==0;
		//int n=45;
		for(Integer n:list)
		if(predicate.test(n))
			System.out.println(n);
		
		predicate=(n)->n>30;
		for(Integer n:list)
			if(predicate.test(n))
				System.out.println(n);
		
		List<String> names = Arrays.asList(
                "Sahil", "Amit", "Sneha", "Rahul",
                "Sagar", "Priya", "Sachin", "Neha", "Sunita"
        );

        // Predicate to check if name starts with 'S'
        Predicate<String> predicate1 = name -> name.startsWith("S");

        System.out.println("Names starting with S:");

        for (String name : names) {
            if (predicate1.test(name)) {
                System.out.println(name);
            }
            
            
        }
        
        
		

	}
        
	   

}
