package com.coforge.Day_06_07_2026prj;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueMain {
	public static void main(String[] args) {
//		
//		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
//		pq.add(52);
//		pq.add(95);
//		pq.add(23);
//		pq.add(41);
//		pq.add(87);
//		pq.add(98);
//		pq.add(12);
//		pq.add(35);
//		pq.add(56);
//		pq.add(52);
//		pq.add(58);
//		pq.add(66);
//		System.out.println(pq);
//		
//		System.out.println("*************************************");
//		
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println("*************************************");
//		System.out.println(pq.offer(56));
//		System.out.println(pq);
		
		
		ArrayDeque<Integer>ad=new ArrayDeque<Integer>();
		ad.add(89);
		ad.add(67);
		ad.add(45);
		ad.add(84);
		ad.add(59);
		ad.addFirst(99);
		ad.addLast(55);
		
		System.out.println(ad);
		
		
	}

}
