// using throw keyword

package com.k2js.exceptionhandling.practice;

class Prog5{
	
	public void findLength(String s){
		
		System.out.println("find length method");
		try{
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("null is not input "+e);
			throw e;
		}
	}
	
	public static void main(String...abc){
		System.out.println("main method");
		
		Prog5 p5=new Prog5();
		p5.findLength("Hello");
		p5.findLength(null);
		System.out.println("Completed");
	}
}