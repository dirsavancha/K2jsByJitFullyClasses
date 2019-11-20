// Assignment: generate numbers 25



package com.k2js.conditions.ifelsepractice;

class IfPro4{
	public static void m(){
		int i=(int)(Math.random()*25)+1;
		int r=(int)i;
		System.out.println("random value is"+i);
		
		if(i<5){
			System.out.println(i+"is less than five");
		}
		if(i<10){
			System.out.println(i+"is less than Ten");
		}
		if(i<15){
			System.out.println(i+"is less than Fifteen");
		}
		if(i<20){
			System.out.println(i+"Is less than Twenty");
		}
		if(i<25) {
			System.out.println(i+"is less than Twenty Five");
		}
		
	}
}

class Ifpro4Test{
	public static void main(String...abc){
		IfPro4.m();
	}
}