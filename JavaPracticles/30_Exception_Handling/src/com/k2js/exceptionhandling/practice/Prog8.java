//  Exception
// Generic

// Parent Class Exception can handle any type of child exception 

// 

package com.k2js.exceptionhandling.practice;

class Prog8{
	
	public void findLength(String s){
		
		System.out.println("find length method");
		System.out.println(s.length());
	}
	
	public static void main(String...abc){
		
		System.out.println("main method");
		
		Prog8 p8=new Prog8();
		p8.findLength("Hello");
		try{
			p8.findLength(null);
			p8.findLength(abc[0]);
		}catch(NullPointerException e){
			System.out.println("input is not provided to main method");
			
		} catch(Exception e){
			System.out.println("Developer doesn't handle it ");
			
		}
		p8.findLength(null);
		System.out.println("Completed");
	}
}

