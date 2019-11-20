//
package com.k2js.collections.listpratice;
import java.util.*;

class Prog2{
	
	public static void main(String...abc){
		ArrayList<Integer> allvalues=new ArrayList<>();
			
		allvalues.add(10);
		allvalues.add(5);
		allvalues.add(15);
		allvalues.add(16);
		allvalues.add(17);
		allvalues.add(15);
		allvalues.add(16);
		
		Iterable<Integer> iterable=allvalues;
		iterable.forEach((x)->System.out.println(x));
		// Or
		iterable.forEach(System.out::println); // Lambda
	}
}