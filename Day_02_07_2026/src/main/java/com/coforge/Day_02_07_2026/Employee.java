package com.coforge.Day_02_07_2026;



public class Employee extends Person {
	 private int eid;
	   private double salary;
	   public Employee() {
	       super();
	   }
	   public Employee(String name, int age, String address, int eid, double salary) {
	       super(name, age, address); 
	       this.eid = eid;
	       this.salary = salary;
	   }
	   @Override
	   public String toString() {
	       return "ID: " + eid + ", Salary: " + salary + " | " + super.toString();
	   }
	   
	    @Override
	    public String sayHello() {
	    	// TODO Auto-generated method stub
	    	return super.sayHello() + " and from Employee class";
	    }

}