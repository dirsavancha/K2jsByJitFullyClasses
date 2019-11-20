//
package com.k2js.collections.listpratice;
import java.util.*;

class Prog3{
	
	public static void main(String...abc){
		Collection<Integer> allvalues=new ArrayList<>();
		
		
		allvalues.add(10);
		allvalues.add(5);
		allvalues.add(15);
		allvalues.add(16);
		allvalues.add(17);
		allvalues.add(15);
		allvalues.add(16);
		
		System.out.println(allvalues.size());
		System.out.println(allvalues.isEmpty());
		System.out.println(allvalues.contains(5));
		
	
		
		
	}
}