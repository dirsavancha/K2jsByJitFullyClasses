// Name is String or String Buffer or String builder// Price any number// colour is only string
package com.k2js.generics.practice;

class Soap<P extends Number,N extends CharSequence,C extends String>{
	P price;
	N name;
	C colour;
	
	Soap(P price,N name,C colour){
		
		this.price=price;
		this.name=name;
		this.colour=colour;
		
	}
	@Override
	public String toString(){
		return "Price ="+this.price+"Name ="+this.name+"\t"+"colour ="+this.colour+"\t";
	}
	
	

}

class SoapTest{
		public static void main(String...abc){
			Soap<Integer,String,String> s1=new Soap<>(10,"Dove","White");
			Soap<Double,StringBuffer,String> s2=new Soap<>(18.,new StringBuffer("MysoreSandle"),"Yellow");
			Soap<Number,String,String> s3=new Soap<>(25,"Chintol","Green");
			
			Double i=(Integer)s1.price+(Double)s2.price+(Integer)s3.price;
			System.out.println(i);

			
		}

	
}