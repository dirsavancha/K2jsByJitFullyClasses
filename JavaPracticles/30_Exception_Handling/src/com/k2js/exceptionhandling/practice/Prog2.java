// try catch

package com.k2js.exceptionhandling.practice;

class Prog2{
	
	public static void findLength(String s){
		
	System.out.println("find length method");
	System.out.println(s.length());
	}
	public static void main(String...abc){
		
		System.out.println("main method");
		Prog2 p2=new Prog2();
		p2.findLength("Hello");
		
		try{
			p2.findLength(abc[0]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Input not provider still i will execute");
		}
		System.out.println("Completed");
	}
}