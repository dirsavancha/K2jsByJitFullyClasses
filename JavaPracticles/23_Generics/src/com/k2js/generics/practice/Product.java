// 

package com.k2js.generics.practice;

class Product{
	String name;
	int cost;
	
	Product(String n,int c){
		this.name=n;
		this.cost=c;
		
	}
	
	@Override
	
	public String toString(){
		return "Name ="+this.name+"\t"+"Cost ="+this.cost+"\t";
	}
}

class ProductTest{
	public static void main(String...abc){
		
		Product p1=new Product("Soap",18);
		Product p2=new Product("Pen",5);
		Product p3=new Product("NoteBook",30);
		
		int total=p1.cost+p2.cost+p3.cost;
		System.out.println(total);
	}
}