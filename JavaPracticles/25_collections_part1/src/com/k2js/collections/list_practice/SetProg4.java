// Converting List to set

package com.k2js.collections.list_practice;

import java.util.*;

class ListToSetProg1{
	
	
	public static void main(String...abc){
		
		ArrayList<String> allnames=new ArrayList<>();
		
		allnames.add("Naniah");
		allnames.add("Rama Krishna");
		allnames.add("Srikanth");
		allnames.add("Sail");
		allnames.add("Krishna");
		allnames.add("Sandeep");
		allnames.add("Manjula");
		allnames.add("Janitha");
		
		System.out.println("List all names");
		System.out.println(allnames);
		
		HashSet<String> fruits=new HashSet<>();
		
		fruits.add("Bannana");
		fruits.add("Chikoo");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.addAll(allnames);
		System.out.println(fruits);
		
		// to sort
		
		Set<String> srt=new TreeSet<>(fruits);
		System.out.println(srt);
		
		
		

	}
}