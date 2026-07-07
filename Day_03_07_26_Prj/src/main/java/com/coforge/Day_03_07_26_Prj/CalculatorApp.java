package com.coforge.Day_03_07_26_Prj;

public class CalculatorApp implements Simple_Calculator,Scientific_Calculator {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("Addition : "+c);
		
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println("Substration : "+c);
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println("Multiplication : "+c);
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println("Division : "+c);
		
	}

	
	@Override
	public double power(double a, double b) {
		// TODO Auto-generated method stub
		return Math.pow(a, b);
	}

	@Override
	public double squareRoot(double m) {
		// TODO Auto-generated method stub
		return Math.sqrt(m);
	}

	@Override
	public double logValue(double m) {
		// TODO Auto-generated method stub
		return Math.log(m);
	}
	
	
	public static void main(String[] args) {
		CalculatorApp c=new CalculatorApp();
		
		c.add(3, 5);
		c.sub(7, 3);
		c.mul(4, 5);
		c.div(9, 4);
		System.out.println(c.power(4, 2));
		System.out.println(c.logValue(10));
		System.out.println(c.squareRoot(64));
	}

	

}
