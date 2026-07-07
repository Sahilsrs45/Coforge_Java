package com.coforge.Day_07_07_2026;

public class CustomException {
	public static void main(String[] args) throws AgeNotSufficientException {
		
		Person p=new Person("sahil",17,"Pune");
		
		if(p.getAge()<18) {
			throw new AgeNotSufficientException("person age is less than 18");
		
		}
		else 
			System.out.println("Person is eligible to vote");
	}

}
