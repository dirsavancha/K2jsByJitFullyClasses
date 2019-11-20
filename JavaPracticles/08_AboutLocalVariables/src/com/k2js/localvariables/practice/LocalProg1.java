// Finding Odd or Event

package com.k2js.localvariables.practice;

class Lpro1{
	public static void m(){
		int i=41;
		int a=i/10;
		int b=1%10;
		System.out.println((a+b)/2==0?"Even":"Odd");
		
		//or 
		/*
		int sum=a+b;
		String r=(sum/2==0)?"Even":"Odd";
		System.out.println(r);
		
		int sum=a+b;
		boolean eo=(sum%2==0);
		String r=(sum/2==0)?"Even":"Odd";
		System.out.println(r);
		*/
		
		
	}
	
}
class Lpro1Test{
	public static void main(String...abc){
		Lpro1.m();
	}
}