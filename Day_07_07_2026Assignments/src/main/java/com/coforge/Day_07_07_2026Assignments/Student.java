package com.coforge.Day_07_07_2026Assignments;

public class Student {

    private String name;
    private int id;
    private int[] marks;
    private String phoneNo;
    private String email;
    private String branch;

    public Student(String name, int id, int[] marks, String phoneNo, String email, String branch) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.phoneNo = phoneNo;
        this.email = email;
        this.branch = branch;
    }

    public void generateReport() {

        System.out.println("\n----------- STUDENT REPORT -----------");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Branch : " + branch);
        System.out.println("Phone  : " + phoneNo);
        System.out.println("Email  : " + email);

        int total = 0;

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Subject " + (i + 1) + " Marks : " + marks[i]);
                total += marks[i];
            }

            int divisor = 3; // Change to 0 to test ArithmeticException

            double avg = total / divisor;

            System.out.println("Total   : " + total);
            System.out.println("Average : " + avg);

            if (avg >= 75)
                System.out.println("Grade : A");
            else if (avg >= 60)
                System.out.println("Grade : B");
            else if (avg >= 40)
                System.out.println("Grade : C");
            else
                System.out.println("Grade : Fail");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception : " + e.getMessage());
        }
    }
}
