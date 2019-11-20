package com.k2js.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) {
		TreeSet<Integer>al=new TreeSet<>();
		
		al.add(10);
		al.add(2);
		al.add(30);
		al.add(50);
		al.add(40);
		al.add(10);
		al.add(40);
		
		
		Iterator<Integer> it=al.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Descending Set"+al.descendingSet());
		
		
		
	}

}
