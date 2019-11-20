// 

package com.k2js.exceptionhandling.practice;

class Prog14{
	
	public static void m(String str){
		int i=100;
		System.out.println("main method");
		try{
			int l=str.length();
			System.out.println(l);
			System.out.println(i%l);
		}catch(NullPointerException e){
			System.out.println("Null is not input");
			throw e;
		}catch(ArithmeticException a){
			System.out.println(a.getMessage());
			throw a;
			
		}
	}
}

class Prog14Test{
	
	public static void main(String...abc){
		Prog14.m("Hello");
		Prog14.m("K2js");
		Prog14.m("");
	}
}