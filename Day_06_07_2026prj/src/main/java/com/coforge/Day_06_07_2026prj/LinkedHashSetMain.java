package com.coforge.Day_06_07_2026prj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetMain {
	public static void main(String[] args) {

		        LinkedHashSet<Employee> empSet = new LinkedHashSet<>();

		        empSet.add(new Employee("Sahil", 101, "Pune", "IT", 55000));
		        empSet.add(new Employee("Rahul", 102, "Mumbai", "HR", 48000));
		        empSet.add(new Employee("Amit", 103, "Nagpur", "Finance", 62000));
		        empSet.add(new Employee("Sneha", 104, "Nashik", "IT", 58000));
		        empSet.add(new Employee("Priya", 105, "Pune", "Marketing", 50000));
		        empSet.add(new Employee("Rohit", 106, "Mumbai", "Sales", 47000));
		        empSet.add(new Employee("Neha", 107, "Aurangabad", "HR", 52000));
		        empSet.add(new Employee("Karan", 108, "Kolhapur", "IT", 67000));
		        empSet.add(new Employee("Anjali", 109, "Satara", "Finance", 61000));
		        empSet.add(new Employee("Vikas", 110, "Solapur", "Sales", 49000));
		        empSet.add(new Employee("Meena", 111, "Pune", "Marketing", 53000));
		        empSet.add(new Employee("Arjun", 112, "Nagpur", "IT", 72000));
		        empSet.add(new Employee("Pooja", 113, "Mumbai", "HR", 56000));
		        empSet.add(new Employee("Nikhil", 114, "Nashik", "Finance", 64000));
		        empSet.add(new Employee("Komal", 115, "Pune", "Sales", 45000));
		        empSet.add(new Employee("Akash", 116, "Kolhapur", "IT", 69000));
		        empSet.add(new Employee("Riya", 117, "Aurangabad", "Marketing", 51000));
		        empSet.add(new Employee("Deepak", 118, "Satara", "Finance", 60000));
		        empSet.add(new Employee("Shweta", 119, "Mumbai", "HR", 57000));
		        empSet.add(new Employee("Vinay", 120, "Pune", "IT", 75000));

		        // Print all employees
		        System.out.println("Employee List:");
		        for (Employee emp : empSet) {
		            System.out.println(emp);
		        }

		        // Convert LinkedHashSet to ArrayList for sorting
		        ArrayList<Employee> empList = new ArrayList<>(empSet);

		        // Sort using Comparable
		        Collections.sort(empList);

		        System.out.println("\nAfter sorting:");
		        for (Employee emp : empList) {
		            System.out.println(emp);
		        }

		        // Sort using Comparators
		        empList.sort(new CityComparator()
		                .thenComparing(new DepartmentComparator())
		                .thenComparing(new SalaryComparator()));

		        System.out.println("\nAfter sorting on City, Department and Salary:");
		        for (Employee emp : empList) {
		            System.out.println(emp);
		        }
		    }
		
	

}
