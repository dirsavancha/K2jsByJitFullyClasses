//

package com.k2js.exceptionhandling.practice;

class Prog3{
	public void findLength(String s){
		System.out.println("find length method");
	
		try{
			System.out.println(s.length());
		}catch (NullPointerException e){
			System.out.println("Null is not a input ="+e); // Exception name
			System.out.println("Null is not a input ="+e.getMessage()); // Exception message
			System.out.println("Null is not a input =");
			e.printStackTrace();
		}
	}
	public static void main(String...abc){
		System.out.println("main method");
		
		Prog3 p3=new Prog3();
		p3.findLength("Hello");
		p3.findLength(null);
		System.out.println("Completed");
	}
	
}