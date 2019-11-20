package com.k2js.collection.queue;

import java.util.ArrayDeque;

public class Deque {
	public static void main(String[] args) {
		ArrayDeque<Integer> al=new ArrayDeque();
		
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(10);
		al.add(10);
		System.out.println(al);
		
		al.addFirst(1);
		System.out.println(al);
		al.addLast(50);
		System.out.println(al);
		System.out.println(al.offerFirst(2));
		System.out.println("Offer first"+al);
		
	}

}
