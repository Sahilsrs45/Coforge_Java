package com.coforge.Day_07_07_2026Assignments;

import java.util.Scanner;

class StudentExp {

    private String name;
    private int marks;
    
    
    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return "StudentExp [name=" + name + ", marks=" + marks + "]";
	}

	public StudentExp(String name, int marks) throws InvalidMarksException {

        if (marks < 0 || marks > 100)
            throw new InvalidMarksException("Marks should be between 0 and 100.");

        this.name = name;
        this.marks = marks;
    }

    public void display() {

        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);

    }

}


public class StudentMain {

    public static void main(String[] args) {

        try {

        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter Student Name:");
        	String std=sc.next();
        	System.out.println("Enter Student Marks:");
        	int marks=sc.nextInt();
            StudentExp s = new StudentExp(std, marks);
            
           // System.out.println("Student Details : "+s);
            
            sc.close();

            s.display();

        } catch (InvalidMarksException e) {

            System.out.println(e.getMessage());

        }

    }

}