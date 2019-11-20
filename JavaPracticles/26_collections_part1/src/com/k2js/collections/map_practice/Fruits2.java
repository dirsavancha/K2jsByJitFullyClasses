// using TreeMap
//

package com.k2js.collections.map_practice;

import java.util.*;

class Fruits2{
	
	String name,colour;
	int price;
	
	Fruits2(String name,String colour){
		
		this.name=name;
		this.colour=colour;
		
	}
	
	@Override
	
	public String toString(){
		return "Name ="+this.name+"\t"+"colour ="+this.colour+"\t"+"Price =";
	}
	
	@Override
	
	public int hashCode(){
		return this.name.hashCode();
		
	}
	
	@Override
	public boolean equals(Object o){
		return this.colour.equalsIgnoreCase(((Fruits)o).colour);
	}
}

class Fruits2Test{
	
	public static void main(String...abc){
		Map<Fruits2,Integer> frt=new TreeMap<>((x,y)->x.name.compareTo(y.name));
		
		frt.put(new Fruits2("Mango","Yellow"),200);
		frt.put(new Fruits2("Mango","Green"),150);
		frt.put(new Fruits2("Mango","Yellow"),200);
		frt.put(new Fruits2("Mango","Yellow"),250);
		frt.put(new Fruits2("Orange","Yellow"),300);
		
		System.out.println(frt);
	}
}