// By using constructor colour and brand mandatory, price and model is not mandatory

package com.k2js.constructors.practice;

class Fan{
	
	String colour,brand,model;
	int price;
	
	Fan(String colour,String brand){
		this.colour=colour;
		this.brand=brand;
		
	}
	Fan(String colour,String brand,int price,String model){
		this(colour,brand);
		this.price=price;
		this.model=model;
	}
	@Override
	public String toString(){
		String colour ="colour :"+this.colour +"\t";
		String brand ="brand :"+this.brand +"\t";
		int price=this.price;
		String model="model :"+this.model +"\t";
		
		return "Fan details :"+colour+brand+price+model;
	}
}

class FanTest{
	public static void main(String...abc){
		Fan obj1=new Fan("White","Usha Fans");
		System.out.println(obj1);
		
		Fan obj2=new Fan("Blue","crompton",400,"Table");
		System.out.println(obj2);
		
		Fan obj3=new Fan("Green","Havels",500,"floor Stand");
		System.out.println(obj3);
	}
}