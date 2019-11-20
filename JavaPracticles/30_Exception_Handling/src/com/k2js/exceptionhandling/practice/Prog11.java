// Using finally block

package com.k2js.exceptionhandling.practice;

class Prog11{
	
	public static void m(String str){
		System.out.println("main method");
		try{
			System.out.println(str.length());
		}catch(NullPointerException e){
			e.printStackTrace();
			throw e;
		}finally{
			System.out.println("Thank you for Calling");
		}
	}
}
class Prog11Test{
	
	public static void main(String...abc){
		Prog11.m("Hello");
		Prog11.m(null);
		Prog11.m("K2js");
	}
}