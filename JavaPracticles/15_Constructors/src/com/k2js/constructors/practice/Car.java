//By using constructor create Car colour is not mandatory,wheels, is mandatory

package com.k2js.constructors.practice;


class Car{
	int wheels;
	String model,colour;
	
	Car(int wheels){
		this.wheels=wheels;
		
	}
	
	Car(int wheels,String model,String colour){
		
		this(wheels);
		this.model=model;
		this.colour=colour;
		
	}
	@Override
	public String toString(){
		String wheels="no.of wheels "+this.wheels+"\t";
		String model="Model is "+this.model+"\t";
		String colour="Colour of the car is "+this.colour+"\t";
		return "Car Details"+wheels+model+colour;
	}
}

class CarTest{
	public static void main(String...abc){
		Car obj=new Car(4,"Toyato","black");
		System.out.println(obj);
	}
}