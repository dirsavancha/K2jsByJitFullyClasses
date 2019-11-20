package com.k2js.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prog1 {
	public static void main(String[] args) {
		// Set<Integer> al=new HashSet<>();
		//Set<Integer> al = new LinkedHashSet<>();
		Set<Integer> al = new TreeSet<>();
		

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(10);
		al.add(40);
		al.add(40);

		al.add(40);
		System.out.println(al);
		System.out.println(al.size());

		//System.out.println(al.contains("60"));  // it will be not there for tree set
		System.out.println(al.isEmpty());

		Iterator<Integer> items = al.iterator();
		while (items.hasNext()) {
			System.out.println(items.next());

		}
		System.out.println("-----------");
		Object[] arr = al.toArray();
		for (Object s : arr) {
			System.out.println(s);
		}

		System.out.println("hashcode" + al.hashCode());

	}

}
