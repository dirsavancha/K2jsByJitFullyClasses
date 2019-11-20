// Compile time Polymorphism // Run time poly morphism

package com.k2js.polymorphism.practice;

class AParent1{
	
	void m(){
		System.out.println("Parent class A method");
	}
}

class AChild1 extends AParent1{
	
	@Override
	void m(){
		System.out.println("A Child1 class m method");
	}
}

class AChild2Test{
	
	public static void main(String...abc){
		AChild1 ac1=new AChild1();   // Compile time polymorphism
		ac1.m();
		
		AParent1 ap1=new AChild1();  // Run time Polymorphism (when a child pointing to parent is know as run time polymorphism)
		ap1.m();
	}
}