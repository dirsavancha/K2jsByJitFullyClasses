package com.k2js.collection.set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Prog2 {
	
	public static void main(String[] args) {
		
	
		SortedSet<Integer> al=new TreeSet<>();
		

		al.add(10);
		al.add(2);
		al.add(30);
		al.add(50);
		al.add(40);
		al.add(10);
		al.add(40);
		System.out.println(al);
		System.out.println(al.subSet(2, 40));
		System.out.println(al.first());
		System.out.println(al.headSet(30));
		System.out.println(al.tailSet(40));
		System.out.println(al.last());
		
		
	}

}
