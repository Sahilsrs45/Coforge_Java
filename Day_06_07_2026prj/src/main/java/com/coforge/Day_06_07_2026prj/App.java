package com.coforge.Day_06_07_2026prj;

import java.awt.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        LinkedList<String> nameList=new LinkedList<String>();
        nameList.add("Sahil");
        nameList.add("Saurabh");
        nameList.add("Sahil");
        nameList.add("Priya");
        nameList.add(null);
        nameList.add(null);
        nameList.add("Sahil");
        System.out.println(nameList);
        
       
        System.out.println("************************");
        nameList.addFirst("Shivam");
        nameList.addLast("Ameya");//returns void value
        System.out.println(nameList);
       
        System.out.println("************************");
//        Iterator<String>itr=nameList.iterator();
//        
//        while(itr.hasNext())
//        	System.out.println(itr.next());
//        
        System.out.println("************************");
        System.out.println("In descending order");
       Iterator itr=nameList.descendingIterator();
        while(itr.hasNext())
        	System.out.println(itr.next());
        
        System.out.println("************************");
        System.out.println(nameList.element());
       System.out.println(nameList.offer("Mona"));//return true if element is added
       System.out.println(nameList.offerFirst("Sanjay"));
       System.out.println(nameList);
       
       System.out.println("Peek name or first name : "+nameList.peek());//returns first element
       
       
       System.out.println("In reversed order:");
       LinkedList<String>list=nameList.reversed();
       System.out.println(list);
        
       System.out.println(list.contains("Sahil"));
       
       System.out.println(list.isEmpty());
       list.remove("Sanjay");
       
      System.out.println(list.indexOf("Ameya"));
      
      System.out.println(list.get(4));
      
      Collections.sort(list);
     // System.out.println(list);
       
       
        		
    }
}
