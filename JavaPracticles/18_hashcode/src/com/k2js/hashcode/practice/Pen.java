// Creating class pen 

package com.k2js.hashcode.practice;

class Pen{
	
	String colour,brand;
	int price;
	
	Pen(String colour,String brand){
		
		this.colour=colour;
		this.brand=brand;
	}
	
	Pen (String colour,String brand,int price){
		
		this(colour,brand);
		this.price=price;
	}
	@Override
	public String toString(){
		String colour="colour is "+this.colour+"\t";
		String brand="brand is "+this.brand+"\t";
		String price="price is "+this.price+"\t";
		return "Pen details "+colour+brand+price;
	}
	
	@Override
	public int hashCode(){
		return this.colour.hashCode(); //or java.util.Objects.hashCode(this.colour);
	}
}

class PenTest{
	
	public static void main(String...abc){
		Pen p1=new Pen("Green","Cello");
		Pen p2=new Pen("Green","Cello");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}
}

/*
 output with out override
 

1829164700
2018699554


output with override


69066467
69066467


*/