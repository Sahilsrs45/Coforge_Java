package com.coforge.Day_02_07_2026;



public class Student extends Person{
	private int id;
	   private String branchName;
	   private String collegeName;
	   public Student() {
	       super();
	   }
	   public Student(String name, int age, String address, int id, String branchName, String collegeName) {
	       super(name, age, address);
	this.id = id;
	       this.branchName = branchName;
	       this.collegeName = collegeName;
	   }
	   @Override
	   public String toString() {
	       return "Student ID: " + id + ", Branch: " + branchName + ", College: " + collegeName + " | " + super.toString();
	   }
	   
	   @Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return super.sayHello()+" and From Student";
	}

}