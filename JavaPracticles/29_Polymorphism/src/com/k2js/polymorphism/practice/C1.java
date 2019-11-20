//

package com.k2js.polymorphism.practice;

interface AParent1{
	
	default void m(){
		System.out.println("Parent class A method");
	}
}

class AChild1 implements AParent1{
	
	@Override
	public void m(){
		System.out.println("A Child1 class m method");
	}
}

class AChild2Test1{
	
	public static void main(String...abc){
		AChild1 ac1=new AChild1();
		ac1.m();
		
		AParent1 ap1=new AChild1();  // Run time Polymorphism (when a child pointing to parent is know as run time polymorphism)
		ap1.m();
	}
}