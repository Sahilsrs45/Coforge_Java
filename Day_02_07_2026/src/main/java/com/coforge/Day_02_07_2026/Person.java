package com.coforge.Day_02_07_2026;


class Person {
	   protected String name;
	   protected int age;
	   protected String address;
	   public Person() {
	       super(); 
	   }
	   public Person(String name, int age, String address) {
	       super();
	       this.name = name;
	       this.age = age;
	       this.address = address;
	   }
	   @Override
	   public String toString() {
	       return "Name: " + name + ", Age: " + age + ", Address: " + address;
	   }
	   
	   public String sayHello() {
		return " Hi from parent class" ;
		//super.sayHello()+ 
	   
		}
	}
	