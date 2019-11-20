//Passing class parameter and overriding the hashCode and equals method it will not allow duplicates
// sorting the elements in set by using TreeSet 

package com.k2js.collections.list_practice;

import java.util.*;

class B {
	
	String name;
	
	B(String name){
		this.name=name;
		
	}
	@Override
	public String toString(){
		return this.name;
	}
	
	/*@Override
	
	public int compareTo(Object o){
		  
		return((B)o).name.compare(this.name); 
	}*/
	/*public int compareTo(B b1)
	{
		String n1 =  this.name;
		String n2 = b1.name;
		return this.name.compareTo(b1.name);
	}*/ 
	/*@Override
	public int hashCode(){
		return this.name.hashCode();
	}*/
	
	@Override
	public boolean equals(Object o){
		return((B)o).name.equalsIgnoreCase(this.name);
	}
}

class BTest{
	public static void main(String...abc){
		Set<B> allnames=new HashSet<>();
		allnames.add(new B("Hello"));
		allnames.add(new B("Apple"));
		//allnames.add(null);//Single null allows
		allnames.add(new B("k2js"));
		allnames.add(new B("Apple"));
		allnames.add(new B("Bangalore"));
		allnames.add(new B("Java"));
		//allnames.add(null);
		allnames.add(new B("Bangalore"));
		System.out.println("Before sorting"+allnames);
		
		//Set<B> srt=new TreeSet<>(allnames);  // set has no sorting functionality  // wll get run time error as B cannot be cast to java.lang.Comparable
		Set <B> srt2=new TreeSet<>((x,y)->x.name.compareTo(y.name));  // lambda expression
		srt2.addAll(allnames);
		
		
		
		//System.out.println("After sorting"+srt);
		System.out.println("After sorting"+srt2);
		
		
		
		

		
		
	}
}