package com.coforge.Day_07_07_2026;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner sc=new Scanner(System.in);
        try {
        	System.out.println("Enter a: ");
        	int a=sc.nextInt();
        	System.out.println("Enter b: ");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("C : "+c);
            String str = null;
            System.out.println(str.length());
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (NullPointerException e) {
            System.out.println("Object reference is null.");
        }
        catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
        catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        finally {
			System.out.println("After catch block");
		}
        
        
    }
}
