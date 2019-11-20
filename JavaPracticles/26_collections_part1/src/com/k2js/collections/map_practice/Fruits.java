//

package com.k2js.collections.map_practice;

import java.util.*;

class Fruits{
	
	String name,colour;
	int price;
	
	Fruits(String name,String colour){
		
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

class FruitsTest{
	
	public static void main(String...abc){
		Map<Fruits,Integer> frt=new HashMap<>();
		
		frt.put(new Fruits("Mango","Yellow"),200);
		frt.put(new Fruits("Mango","Green"),150);
		frt.put(new Fruits("Mango","Yellow"),200);
		frt.put(new Fruits("Mango","Yellow"),250);
		frt.put(new Fruits("Orange","Yellow"),300);
		
		System.out.println(frt);
	}
}