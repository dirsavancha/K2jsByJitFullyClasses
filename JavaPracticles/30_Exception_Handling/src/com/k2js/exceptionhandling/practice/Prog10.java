// Using finally block

package com.k2js.exceptionhandling.practice;

class Prog10{
	
	public static void m(String str){
		System.out.println("main method");
		try{
			System.out.println(str.length());
		}catch(NullPointerException e){
			e.printStackTrace();
		}finally{
			System.out.println("Thank you for Calling");
		}
	}
}
class Prog10Test{
	
	public static void main(String...abc){
		Prog10.m("Hello");
		Prog10.m(null);
		Prog10.m("K2js");
	}
}