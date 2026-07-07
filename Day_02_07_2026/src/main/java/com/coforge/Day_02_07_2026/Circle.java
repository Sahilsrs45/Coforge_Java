package com.coforge.Day_02_07_2026;

public class Circle extends Shape {
	
	private float r;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(float r) {
		super();
		this.r = r;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle with radius "+r+ " is : "+3.14*r*r);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of circle with radius "+r + " is : "+2*3.14*r);
		
	}
	
	
	 
	

}