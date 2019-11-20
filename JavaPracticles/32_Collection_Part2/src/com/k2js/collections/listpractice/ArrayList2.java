package com.k2js.collections.listpratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArrayAddAndRemoveOperations {
	
	public void addingElements(){
		ArrayList<String>addele=new ArrayList<String>();
		
	ArrayList<Integer>int1=new ArrayList<Integer>();
	
	
		addele.add("Hari");
		addele.add("Chennai");
		addele.add("Hyderabad");
		addele.add(null);
		addele.add("Chennai");
		addele.add(null);
		System.out.println(" Before Addition " + addele.size());
		// Adding Index Based (Insering Element In Middle)
		addele.add(2, "Bangalore");
		System.out.println(" After Index Add " + addele.size());

		for(String add_ele:addele){
			System.out.println(add_ele);
			
		}
	}


	public static void main(String[] args) {
		ArrayAddAndRemoveOperations obj=new ArrayAddAndRemoveOperations();
		obj.addingElements();
		System.out.println(" ");
		
		
	}
		
		
	

}
