//

package com.k2js.polymorphism.practice;

interface AParent1{
	
	void m();
	
}

interface AParent2{
	
	default void m(){
		System.out.println("AParent2 class m method");
	}
}
interface AChild1 extends AParent1,AParent2{
	
	@Override
	default void m(){
		AParent2.super.m();
	}
}

class AChild2Test2{
	
	public static void main(String...abc){
		AChild1 ac1=new AChild1(){};
		ac1.m();
		
		AParent1 ap1=new AChild1(){};  // Run time Polymorphism (when a child pointing to parent is know as run time polymorphism)
		ap1.m();
		AParent2 ap2=new AChild1(){};
		ap2.m();
	}
}