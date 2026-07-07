package com.coforge.Day_03_07_2026Assignemts;

public class PrimeNoArray {


    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 6, 7, 9, 11};

        System.out.println("Prime Numbers:");

        for (int num : arr) {

            if (isPrime(num))
                System.out.print(num + " ");
        }
    }
}
