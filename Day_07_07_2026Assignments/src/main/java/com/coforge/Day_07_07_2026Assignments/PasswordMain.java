package com.coforge.Day_07_07_2026Assignments;

import java.util.Scanner;

public class PasswordMain {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Password:");
    	String password=sc.next();
    	
    	System.out.println("Enter Confirm Password:");
    	String confirmPassword=sc.next();
         sc.close();
        
        try {

            if (!password.equals(confirmPassword))
                throw new PasswordMatchException("Password does not Match.");

            System.out.println("Password Matched.");

        } catch (PasswordMatchException e) {

            System.out.println(e.getMessage());

        }

    }

}