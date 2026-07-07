package com.coforge.Day_07_07_2026Assignments;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
        	System.out.println("Enter Amount to be Withdrawn : ");
        	Scanner sc=new Scanner(System.in);
        	Double amt=sc.nextDouble();

            account.withdraw(amt);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }

    }

}
