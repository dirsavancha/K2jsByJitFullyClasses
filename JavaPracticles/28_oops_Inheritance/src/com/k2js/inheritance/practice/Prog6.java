// using interface in multi level Inheritance
// Interface can't call variables it can call only methods
// we want write default to methods in interface
// In multi level all can be interface

package com.k2js.inheritance.practice;

interface A3{
	
	

	default void l(){
		System.out.println("I am Parent class l method");
	}
	
	default void m(){
		System.out.println("I am Parent class m method");
	}
	default void p(){
		System.out.println("I am Parent class p method");
	}
	
}

interface B3 extends A3{
	
	
	
	
	default  void m(){
		System.out.println("I am child class B3 m method");
	}
	
	default void n()
	{
		System.out.println("I am child class B3 n method");
	}
}

class C3 implements B3{
	
	
	
	public void n(){
		System.out.println("I am child class c3 n method");
	}
	
	public void o(){
		System.out.println("I am child class c3 o method");
	}
	public void p(){
		System.out.println("I am child class c3 p method");
	}
}

class C3Test{
	public static void main(String...abc){
		
		System.out.println("1st possibility");
		
		C3 c3=new C3();
		
		
		c3.l();
		c3.m();
		c3.n();
		c3.o();
		c3.p();
		
		/*Output
		
		
1st possibility
I am Parent class l method
I am child class B3 m method
I am child class c3 n method
I am child class c3 o method
I am child class c3 p method
		*/
		
		System.out.println("2nd possibllty");
		
		A3 a3=new C3();
		
		
		
		a3.l();
		a3.m(); // Compile time polymorphysm
		a3.p();  // Run Time Polymorphysim
		
	}
}