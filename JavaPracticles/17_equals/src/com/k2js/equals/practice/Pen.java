//
package com.k2js.equals.practice;

class Pen{
	
	String colour,brand;
	
	Pen(String c){
		this.colour=c;
		//this.brand=b;
	}
	
	@Override
	public String toString(){
		return "colour ="+this.colour;//+"Brand ="+this.brand;
	}
	
	
	public boolean equals(Pen p){
		return this.colour.equalsIgnoreCase(p.colour); //
	}
}

class PenTest{
	
	public static void main(String...abc){
		Pen p1=new Pen("Green");
		Pen p2=new Pen("Green");
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}
}