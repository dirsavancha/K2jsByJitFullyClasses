//

package com.k2js.collections.setpractice;
import java.util.HashSet;
import java.util.Iterator;

class Prog2{
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("banana");
		hs.add("apple");
		hs.add("orange");
		hs.add("banana");
		System.out.println(hs);
		System.out.println(hs.size());
		
		HashSet<String> newhs = new HashSet<>();
		newhs.add("abc");
		newhs.add("xyz");
		newhs.add("apple");
		
		newhs.addAll(hs);
		System.out.println(newhs);
		boolean b=newhs.remove("abc");
		System.out.println(b);
		
		boolean b1 = newhs.contains("abc");
		System.out.println(b1);
		
		boolean b2 = newhs.containsAll(hs);
		 System.out.println(b2);
		 
		
		newhs.clear();
		System.out.println(newhs);
		System.out.println(newhs.isEmpty());
		
		
	}
}