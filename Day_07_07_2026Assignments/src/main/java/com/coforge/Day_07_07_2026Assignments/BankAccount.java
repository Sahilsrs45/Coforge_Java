package com.coforge.Day_07_07_2026Assignments;


public class BankAccount {

    double balance = 5000;

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance.");

        balance -= amount;

        System.out.println("Remaining Balance : " + balance);

    }

}