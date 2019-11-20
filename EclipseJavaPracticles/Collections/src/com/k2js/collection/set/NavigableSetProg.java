package com.k2js.collection.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Stream;

public class NavigableSetProg {
	public static void main(String[] args) {
		NavigableSet<Integer> al=new TreeSet<>();
		
		al.add(10);
		al.add(2);
		al.add(30);
		al.add(50);
		al.add(40);
		al.add(10);
		al.add(40);
		/*System.out.println(al.lower(30));
		System.out.println(al.higher(10));
		System.out.println(al.ceiling(41)); // it will same element if present or else higher than that element present else null
		System.out.println(al.floor(29));// it will give same element if present or lower element else null
		System.out.println(al.pollFirst());
		System.out.println(al.pollLast());
		System.out.println(al.higher(302));
		System.out.println(al.descendingSet());
		System.out.println(al.subSet(10, 40));
		System.out.println(al.headSet(30));
		System.out.println(al.tailSet(30));
		System.out.println(al.headSet(45,true));
		System.out.println(al.tailSet(30,true));
		System.out.println(al.subSet(2, true, 40, true));
		
		Iterator itr=al.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Stream<Integer> i=al.stream();
		i.forEach(x->System.out.println(x));*/
		al.forEach(x->System.out.println(x));
		
	}

}
