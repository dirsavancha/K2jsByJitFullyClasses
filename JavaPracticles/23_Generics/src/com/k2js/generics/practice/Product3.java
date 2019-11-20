// Writing generics

package com.k2js.generics.practice;

class Product3 <T>{
	
	String name;
	T cost;
	
	Product3(String n,T c){
		
		this.name=n;
		this.cost=c;
		
	}
	
	@Override
	
	public String toString(){
		return "Name +"+this.name+"\t"+"Cost ="+this.cost+"\t";
	}
}

class Product3Test{
	
	public static void main(String...abc){
		Product3 <Integer> p1=new Product3<Integer>("Soap",18);
		Product3<String> p2=new Product3<String>("Pen","5");
		Product3<Double> p3=new Product3<Double>("NoteBook",30.);
		double total_sum=(Integer)p1.cost+Integer.valueOf((String)p2.cost)+(Double)p3.cost;
		

		System.out.println(total_sum);
		
	}
}