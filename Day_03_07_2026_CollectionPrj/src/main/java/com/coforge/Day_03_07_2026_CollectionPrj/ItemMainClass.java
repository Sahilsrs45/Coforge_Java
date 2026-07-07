package com.coforge.Day_03_07_2026_CollectionPrj;

import java.util.ArrayList;
import java.util.Collections;


public class ItemMainClass {
	
	public static void main(String[] args) {
		ArrayList<Item> itemList=new ArrayList<Item>();
		
		Item laptop=new Item("Dell",1234,78000);
		Item mouse=new Item("Logitech",623,500);
		Item printer=new Item("Canon",7678,9800);
		
		itemList.add(laptop);
		itemList.add(mouse);
		itemList.add(printer);
		
		System.out.println(itemList);
		
		Collections.sort(itemList);//cannot apply naturral sorting order
		//comparable ,comparator  interfaces has to be implemented
		
		for(Item i:itemList)
			System.out.println(i);
		
	}

}
