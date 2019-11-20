// using throw keyword an try catch block

package com.k2js.exceptionhandling.practice;

class Prog6{
	
	public void findLength(String s){
		
		System.out.println("find length method");
		try{
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("null is not input "+e);
			
		}
	}
	
	public static void main(String...abc){
		
		System.out.println("main method");
		
		Prog6 p6=new Prog6();
		p6.findLength("Hello");
		try{
			p6.findLength(null);
			p6.findLength(abc[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("input is not provided to main method");
			throw e;
		} 
		p6.findLength(null);
		System.out.println("Completed");
	}
}