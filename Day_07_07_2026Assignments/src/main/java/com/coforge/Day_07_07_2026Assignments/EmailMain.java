package com.coforge.Day_07_07_2026Assignments;

import java.util.Scanner;

public class EmailMain {

    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter email:");
    	
        String email = sc.next();
        sc.close();

        try {

            if (!(email.contains("@") && email.endsWith(".com")))
                throw new InvalidEmailException("Invalid Email Address.");

            System.out.println("Valid Email.");

        } catch (InvalidEmailException e) {

            System.out.println(e.getMessage());

        }

    }

}