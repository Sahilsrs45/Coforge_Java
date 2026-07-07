package com.coforge.Day_06_07_2026prj;

import java.awt.List;
import java.util.Enumeration;
import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {
	Vector<Integer> vector=new Vector<Integer>();
	
	vector.add(56);
	vector.add(67);
	vector.add(78);
	
	
	for(int i=1;i<=10;i++) 
		vector.add(i);
	
	System.out.println(vector);
	System.out.println(vector.capacity());
	
	vector.add(11);
	System.out.println(vector.capacity());
	
	
	Enumeration<Integer> enumeration=vector.elements();
	while(enumeration.hasMoreElements())
		System.out.println(enumeration.nextElement());
	
	

	
	
	}
	
	
	

}
