package com.coforge.Day_02_07_2026;


public class Square extends Shape {
	
	private double side;
	
	
	
	

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Square(double side) {
		super();
		this.side = side;
	}
	

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		System.out.println("Area of square  is :"+side*side);
		
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("perimeter of square is :"+4*side);
		
	}

	
	

}