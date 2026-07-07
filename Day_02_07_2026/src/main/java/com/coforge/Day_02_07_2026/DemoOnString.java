package com.coforge.Day_02_07_2026;


public class DemoOnString {


		public static void main(String[] args) {
			String s1="Sahil";
			System.out.println(s1);
			System.out.println(s1.hashCode());
			s1="Sahil Ranawde";
			System.out.println(s1);
			System.out.println(s1.hashCode());
			
			String s2="Sahil";
			System.out.println(s2.hashCode());
			String s3="Sahil";
			System.out.println(s3.hashCode());
		}

	}