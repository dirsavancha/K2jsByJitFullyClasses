// Sum of all the values 

package com.k2js.generics.practice;

class Product2{
	
	String name;
	Object cost;
	
	Product2(String n,Object c){
		
		this.name=n;
		this.cost=c;
		
	}
	
	@Override
	
	public String toString(){
		return "Name ="+this.name+"\t"+"Cost ="+this.cost+"\t";
	}
	
}

class Product2Test{
	
	public static void main(String...abc){
		
		Product2 p1=new Product2("Soap",18);
		Product2 p2=new Product2("Pen","5");
		Product2 p3=new Product2("NoteBook",30.);
		
		
		//double total_sum=(Integer)p1.cost+Integer.valueOf((String)p2.cost)+(Integer)p3.cost;  // Here we are using generics instead of Double we use Integer we will get an run time error so why we use generics
		
		
		double total_sum=(Integer)p1.cost+Integer.valueOf((String)p2.cost)+(Double)p3.cost;

		System.out.println(total_sum);
		
		
	}
}