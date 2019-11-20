// Using finally block

package com.k2js.exceptionhandling.practice;

class Prog12{
	
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
class Prog12Test{
	
	public static void main(String...abc){
		Prog12.m("Hello");
		try{
			Prog12.m(null);
		}catch(NullPointerException e){
			e.printStackTrace();
			
		}
		
		Prog12.m("K2js");
	}
}