package com.coforge.Day_03_07_2026_CollectionPrj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("Sahil",101,70899,"Punawale");
		Employee e2=new Employee("Shivam",102,50000,"DangeChowk");
		Employee e3=new Employee("Atharva",105,70000,"NaviMumbai");
		Employee e4=new Employee("Mit",111,63420,"Kolhapur");
		Employee e5=new Employee("Arjun",104,90899,"Shrirampur");
		Employee e6=new Employee("Parimal",151,40899,"Shegaon");
		Employee e7=new Employee("Abhay",191,80899,"Ambegaon");
		Employee e8=new Employee("Ameya",124,30890,"Chichwad");
		Employee e9=new Employee("Yash",119,45899,"Pune");
		Employee e10=new Employee("Suyog",121,65389,"Punawale");
		
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		emp.add(e9);
		emp.add(e10);
		
		System.out.println("Employees :");
		
		for(Employee e:emp) {
			System.out.println("Name :"+e.getName()+" Id:"+e.getId()+" Salary:"+ e.getSalary()+" Address :"+e.getAddress());
			
		}
		
		//Sorting
		Collections.sort(emp);
		
		System.out.println("******************************");
		System.out.println("Employees in Sorted order :");
		
		for(Employee e:emp) {
			System.out.println("Name :"+e.getName()+" Id:"+e.getId()+" Salary:"+ e.getSalary()+" Address :"+e.getAddress());
			
		}

	}

}
