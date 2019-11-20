//

package com.k2js.generics.practice;

class Product4<T extends Number>{
	
	String name;
	 T cost;
	
	Product4(String n,T c){
		
		this.name=n;
		this.cost=c;
		
	}
	
	@Override
	
	public String toString(){
		return "Name +"+this.name+"\t"+"Cost ="+this.cost+"\t";
	}

}

class Product4Test{
	
	public static void main(String...abc){
		Product4 <Number> p1=new Product4<>("Soap",18);
		Product4<Number> p2=new Product4<>("Pen",5); // or		Product4<Integer> p1=new Product4<>("Pen",5); 
		Product4<Double> p3=new Product4<>("NoteBook",30.);
		double total_sum=p1.cost.intValue()+p2.cost.intValue()+p3.cost;  //double total_sum=p1.cost+p2.cost.intValue()+p3.cost;

		System.out.println(total_sum);
		
		
		
		
	}
}