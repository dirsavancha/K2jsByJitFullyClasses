//

package com.k2js.collections.practice;
import java.util.*;

class Pen{
	String brand,colour;
	int price;
	
	Pen(String brand, String colour, int price){
		this.brand=brand;
		this.colour=colour;
		this.price=price;
		
	}
	
	/*@Override
	
	public String toString(){
		return "brand details ="+this.brand+"\t"+this.colour+"\t"+this.price+"\t";
	}*/
	
	@Override
			public String toString(){
				return ""+this.brand+"\t"+""+this.colour+"\t";
		}
		
	
	
}

class PenTest{
	public static void main(String...abc){
		
		
		ArrayList<Pen> al=new ArrayList<>();
		
		
	
		 al.add(new Pen("Rotomac","Blue",25));
		
	
		al.add(new Pen("Renolds","Black",30));
		System.out.println(al);
		
		
		
		
		
		
		
		
	}
	
}