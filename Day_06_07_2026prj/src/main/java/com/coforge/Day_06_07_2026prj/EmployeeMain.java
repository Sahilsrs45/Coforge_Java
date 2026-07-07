package com.coforge.Day_06_07_2026prj;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeeMain {
	public static void main(String[] args) {

        LinkedList<Employee> empList = new LinkedList<>();

        empList.add(new Employee("Sahil", 101, "Pune", "IT", 55000));
        empList.add(new Employee("Rahul", 102, "Mumbai", "HR", 48000));
        empList.add(new Employee("Amit", 103, "Nagpur", "Finance", 62000));
        empList.add(new Employee("Sneha", 104, "Nashik", "IT", 58000));
        empList.add(new Employee("Priya", 105, "Pune", "Marketing", 50000));
        empList.add(new Employee("Rohit", 106, "Mumbai", "Sales", 47000));
        empList.add(new Employee("Neha", 107, "Aurangabad", "HR", 52000));
        empList.add(new Employee("Karan", 108, "Kolhapur", "IT", 67000));
        empList.add(new Employee("Anjali", 109, "Satara", "Finance", 61000));
        empList.add(new Employee("Vikas", 110, "Solapur", "Sales", 49000));
        empList.add(new Employee("Meena", 111, "Pune", "Marketing", 53000));
        empList.add(new Employee("Arjun", 112, "Nagpur", "IT", 72000));
        empList.add(new Employee("Pooja", 113, "Mumbai", "HR", 56000));
        empList.add(new Employee("Nikhil", 114, "Nashik", "Finance", 64000));
        empList.add(new Employee("Komal", 115, "Pune", "Sales", 45000));
        empList.add(new Employee("Akash", 116, "Kolhapur", "IT", 69000));
        empList.add(new Employee("Riya", 117, "Aurangabad", "Marketing", 51000));
        empList.add(new Employee("Deepak", 118, "Satara", "Finance", 60000));
        empList.add(new Employee("Shweta", 119, "Mumbai", "HR", 57000));
        empList.add(new Employee("Vinay", 120, "Pune", "IT", 75000));

        // Print all employees
        System.out.println("Employee List:");

        for (Employee emp : empList) {
            System.out.println(emp);
        }
        
        Collections.sort(empList);
        System.out.println("After sorting");
        System.out.println(empList);
        
        
        empList.sort(new CityComparator()
        		.thenComparing(new DepartmentComparator()
        				.thenComparing(new SalaryComparator())));
        
        System.out.println("After sorting on city, dept and salary:");
        for(Employee emp:empList)
        	System.out.println(emp);
        
    }
}


