//Passing class parameter and overriding the hashCode and equals method it will not allow duplicates

package com.k2js.collections.list_practice;

import java.util.*;

class A {
	
	String name;
	
	A(String name){
		this.name=name;
		
	}
	@Override
	public String toString(){
		return this.name;
	}
	
	
	@Override
	public int hashCode(){
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object o){
		return((A)o).name.equalsIgnoreCase(this.name);
	}
}

class ATest{
	public static void main(String...abc){
		Set<A> allnames=new HashSet<>();
		allnames.add(new A("Hello"));
		allnames.add(new A("Apple"));
		//allnames.add(null);//Single null allows
		allnames.add(new A("k2js"));
		allnames.add(new A("Apple"));
		allnames.add(new A("Bangalore"));
		allnames.add(new A("Java"));
		//allnames.add(null);
		allnames.add(new A("Bangalore"));
		System.out.println(allnames);	
		
	}
}