

package com.k2js.collections.setpractice;
import java.util.HashSet;
import java.util.Iterator;

class Prog1{
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("banana");
		hs.add("apple");
		hs.add("orange");
		hs.add("banana");
		System.out.println(hs);
		
		HashSet<String> newhs = new HashSet<>();
		newhs.add("abc");
		newhs.add("xyz");
		newhs.add("apple");
		
		newhs.addAll(hs);
		System.out.println(newhs);
	}
}