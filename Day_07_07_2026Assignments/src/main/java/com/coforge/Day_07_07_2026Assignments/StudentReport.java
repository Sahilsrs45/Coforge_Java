package com.coforge.Day_07_07_2026Assignments;


public class StudentReport {

    public static void main(String[] args) {

        Student s1 = new Student(
                "Sahil",
                101,
                new int[] { 85, 90, 80 },
                "9876543210",
                "sahil@gmail.com",
                "Computer");

        Student s2 = null;

        Student students[] = { s1, s2 };

        // Null Pointer Exception
        System.out.println("------ Null Pointer Exception ------");

        for (Student s : students) {

            try {
                s.generateReport();
            } catch (NullPointerException e) {
                System.out.println("Null Pointer Exception : Student object is null.");
            }

        }

        // Arithmetic Exception
        System.out.println("\n------ Arithmetic Exception ------");

        try {
            int total = 300;
            int subjects = 0;

            double avg = total / subjects;

            System.out.println(avg);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : " + e.getMessage());
        }

        // Array Index Out Of Bounds Exception
        System.out.println("\n------ Array Index Out Of Bounds Exception ------");

        try {

            int arr[] = { 10, 20, 30 };

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Out Of Bounds : " + e.getMessage());

        }

        // String Index Out Of Bounds Exception
        System.out.println("\n------ String Index Out Of Bounds Exception ------");

        try {

            String name = "Sahil";

            System.out.println(name.charAt(10));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("String Index Out Of Bounds : " + e.getMessage());

        }

        // Illegal Argument Exception
        System.out.println("\n------ Illegal Argument Exception ------");

        try {

            int marks = 120;

            if (marks > 100 || marks < 0) {

                throw new IllegalArgumentException("Marks should be between 0 and 100.");
            }

        } catch (IllegalArgumentException e) {

            System.out.println("Illegal Argument Exception : " + e.getMessage());

        }

        // Number Format Exception
        System.out.println("\n------ Number Format Exception ------");

        try {

            String id = "10A";

            int num = Integer.parseInt(id);

            System.out.println(num);

        } catch (NumberFormatException e) {

            System.out.println("Number Format Exception : " + e.getMessage());

        }

        // Class Cast Exception
        System.out.println("\n------ Class Cast Exception ------");

        try {

            Object obj = "Hello";

            Integer num = (Integer) obj;

            System.out.println(num);

        } catch (ClassCastException e) {

            System.out.println("Class Cast Exception : " + e.getMessage());

        }

    }

}