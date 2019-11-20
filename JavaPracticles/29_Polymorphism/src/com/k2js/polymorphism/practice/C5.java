//

package com.k2js.polymorphism.practice;

interface AParent1{
	default Comparable m(){
		return 10;
	}
}
class AChild1 implements AParent1{
	
	@Override 
	public Object m(){  // we will get error
		return "K2js";
	}
}

class AChild2Test5{
	public static void main(String...abc){

		
		AParent1 ac1=new AChild1();
		Object o=ac1.m();
		System.out.println(o);
		
	}
}