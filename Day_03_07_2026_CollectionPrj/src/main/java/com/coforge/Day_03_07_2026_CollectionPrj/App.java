package com.coforge.Day_03_07_2026_CollectionPrj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//    	ArrayList alist=new ArrayList();
//    	alist.add(10);
//    	alist.add("sahil");
//    	alist.add(53.28f);
//    	alist.add(true);
//    	alist.add(null);
//    	alist.add(10);
//    	alist.add(10);
//    	alist.add(10);
//    	alist.add(10);
//    	alist.add(20);
//    	alist.add(30);
//    	
//    	System.out.println("Array list :");
//        
//    	for (int i = 0; i < alist.size(); i++) {
//    		
//    		System.out.println(alist.get(i));
			
	//	}
    	
    	
    	
    	ArrayList<Integer> iList=new ArrayList<Integer>()  ;
    	
    	iList.add(10);
    	iList.add(20);
    	iList.add(30);
    	iList.add(40);
    	iList.add(29);
    	iList.add(112);
    	
    	
    	for (int i = 0; i < iList.size(); i++) {
    		System.out.println(iList.get(i));
			
		}
    	
    	iList.add(3, 49);
    	System.out.println("after addition");
    	
//    	
//    	for (int i = 0; i < iList.size(); i++) {
//    		System.out.println(iList.get(i));
//    		
   // 	}
    	
    	ArrayList<Integer> aList=new ArrayList<Integer>();
    	aList.add(40);
    	aList.add(30);
    	aList.add(10);
    	aList.add(50);
    	aList.add(34);
    	aList.add(87);
    	
    	
    	
    	iList.addAll(aList);
    	
    	System.out.println("Arraylist elements after combining both arraylists :");
    	
//    	for (int i = 0; i < iList.size(); i++) {
//    		System.out.println(iList.get(i));
//    		
//    		
//    		
//			
//		}
    	System.out.println(iList.contains(20));
    	
    	
    	//enhanced for loop
    	for(Integer a:iList) {
    		System.out.println(a);
    		
    	}
    	
    	System.out.println(iList.containsAll(aList));
    	
    	 System.out.println(iList.remove(1)); //index wise
    	 
    	 System.out.println(iList.removeAll(aList));
    	 
    	 System.out.println("After removing aList values");
    	 
    	 for(Integer a:iList) {
    		 System.out.println(a);
    	 }
    	 
    	 System.out.println("***************************************");
    	 System.out.println("using forEach method");
    	 //forEach method
    	 
    	 iList.forEach(i->System.out.println(i));
    	
    	 // Collections.reverse(aList);
    	 System.out.println("After reversing ");
    	List<Integer>list= iList.reversed();
    	list.forEach(i->System.out.println(i));
    	
    	iList.addFirst(39);
    	iList.addLast(99);
    	
    	iList.forEach(i->System.out.println(i));
    	////////////////////////
    	///
    	///
    	///
    	
    	
    	System.out.println("Using iterators");
//    	Iterator<Integer>itr=iList.iterator();
//    	while(itr.hasNext()) {
//    		int value=itr.next();
//    		if(value==32)
//    			itr.remove();
//    		System.out.println(value);
//    	}
//    	System.out.println(iList);
    	
    	
    	ListIterator<Integer>itr=iList.listIterator();
    	while(itr.hasNext())
    		System.out.println(itr.next());
    	
    	
    	
    	System.out.println("****************************");
    	System.out.println("Reversed order");
    	
    	while(itr.hasPrevious())
    		System.out.println(itr.previous());
    	
    	
    	
    	
    	//
    	System.out.println("clone Arraylist");
    	System.out.println("******************************************");
    	ArrayList<Integer>cList=(ArrayList<Integer>)iList.clone();
    	System.out.println(iList.hashCode());
    	System.out.println(cList.hashCode());
    	cList.add(678);
    	System.out.println(cList.hashCode());
    }
    
    
}
