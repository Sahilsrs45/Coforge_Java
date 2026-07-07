package com.coforge.Day_02_07_2026;


public class Main {
	public static void main(String[] args) {
	       Employee ec1 = new Employee("Sahil", 22, "Pune", 69, 30000);
	       System.out.println(ec1);
	       
	       Student s1 = new Student("Atharva", 20, "Mumbai", 101, "Computer Science", "GEU");
	       System.out.println(s1);
	       
	       System.out.println(ec1.sayHello());
	       
	       System.out.println(s1.sayHello());
	   }

}