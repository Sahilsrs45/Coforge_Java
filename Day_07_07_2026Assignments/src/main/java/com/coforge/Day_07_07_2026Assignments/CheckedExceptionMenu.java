package com.coforge.Day_07_07_2026Assignments;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CheckedExceptionMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== CHECKED EXCEPTION MENU ==========");
            System.out.println("1. Generate ClassNotFoundException");
            System.out.println("2. Generate IOException");
            System.out.println("3. Generate InterruptedException");
            System.out.println("4. Generate ParseException");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                try {

                    Class.forName("StudentDemo");

                } catch (ClassNotFoundException e) {

                    System.out.println("ClassNotFoundException Caught");
                    System.out.println(e);

                }

                break;

            case 2:

                try {

                    throw new IOException("Unable to Read File.");

                } catch (IOException e) {

                    System.out.println("IOException Caught");
                    System.out.println(e);

                }

                break;

            case 3:

                try {

                    Thread t = Thread.currentThread();

                    // Interrupt the current thread
                    t.interrupt();

                    System.out.println("Thread is going to sleep...");

                    // Since the thread is already interrupted,
                    // sleep() will immediately throw InterruptedException
                    Thread.sleep(3000);

                    System.out.println("Thread woke up.");

                } catch (InterruptedException e) {

                    System.out.println("InterruptedException Caught");
                    System.out.println(e);

                }

                break;

            case 4:

                try {

                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    sdf.setLenient(false);

                    sdf.parse("35-15-2026");

                } catch (ParseException e) {

                    System.out.println("ParseException Caught");
                    System.out.println(e);

                }

                break;

            case 5:

                System.out.println("Program Terminated.");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice.");

            }

        }

    }

}
