// 

package com.k2js.exceptionhandling.practice;

class Prog7{
	
	public void findLength(String s){
		
		System.out.println("find length method");
		System.out.println(s.length());
	}
	
	public static void main(String...abc){
		
		System.out.println("main method");
		
		Prog7 p7=new Prog7();
		p7.findLength("Hello");
		try{
			p7.findLength(null);
			p7.findLength(abc[0]);
		}catch(NullPointerException e){
			System.out.println("input is not provided to main method");
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Developer doesn't handle it ");
			
		}
		p7.findLength(null);
		System.out.println("Completed");
	}
}