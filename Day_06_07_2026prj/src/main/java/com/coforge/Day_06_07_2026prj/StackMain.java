package com.coforge.Day_06_07_2026prj;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		
		for(int i=1;i<=10;i++)
			//stack.push((int) Math.round( Math.random()*100));
		 stack.push(i*3);
		
		System.out.println(stack);
		System.out.println(stack.search(30));
		
		System.out.println(stack.pop());
	}

}
