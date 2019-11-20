//

package com.k2js.polymorphism.practice;

interface AParent1{
	
	default Object m(){
		return 10;
	}
}

class AChild1 implements AParent1{
	
	@Override 
	public String m(){
		return "K2js";
	}
}

class AChild2Test4{
	public static void main(String...abc){
		AChild1 ac1=new AChild1();
		String s=ac1.m();
		System.out.println(s);
		
		AParent1 ac2=new AChild1();
		Object o=ac2.m();
		System.out.println(o);
		
	}
	
}