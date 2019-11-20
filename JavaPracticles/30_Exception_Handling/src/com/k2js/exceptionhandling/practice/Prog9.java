 // Writing two exception independent in same catch block



package com.k2js.exceptionhandling.practice;

class Prog9{
	
	public void findLength(String s){
		
		System.out.println("find length method");
		System.out.println(s.length());
	}
	
	public static void main(String...abc){
		
		System.out.println("main method");
		
		Prog9 p9=new Prog9();
		p9.findLength("Hello");
		try{
			p9.findLength(null);
			p9.findLength(abc[0]);
		} catch(ArrayIndexOutOfBoundsException | NullPointerException e){
			if(e instanceof ArrayIndexOutOfBoundsException){
				System.out.println("Please Provide input");
				
			}else if(e instanceof NullPointerException ){
				System.out.println("Null is not input");
				throw e;
			}
			
		}
		
		System.out.println("Completed");
	}
}

