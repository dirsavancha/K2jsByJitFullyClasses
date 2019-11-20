//  Multiple inheritance
// We should give public to the classes which is implementing to interfaces (Becauese in interface by default all methods are public)

package com.k2js.inheritance.practice;

abstract class AClass1{
	
	int i=10,j=20;
	
	public void m(){
		System.out.println("I am A class m method");
	}
	
	public void n(){
		System.out.println("I am A Class n method ");
	}
	
	void o(){
		System.out.println("I am A Class o method");
	}
}

interface Ainterface1{
	
	//int i=1000;   error: reference to i is ambiguous
	// in multiple inheritance we should not write variables in interface
 
	
	default void m(){
		System.out.println("A interface1 method m");
	}
	
	void n();
	
}

class CClass1 extends AClass1 implements Ainterface1{
	
	void p(){
		System.out.println("I am CClass1 p method");
	}
	
	public static void main(String...abc){
		
		CClass1 obj=new CClass1();
		//System.out.println(obj.i);
		System.out.println(obj.j);
		obj.m();
		obj.n();
		obj.o();
		obj.p(); // this is in main method
		
		System.out.println("=============");
		
		Ainterface1 obj2=new CClass1();
		System.out.println(obj2.i);//
		obj2.m();
		obj2.n();
		System.out.println("=============");
		 
		 AClass1 obj3=new CClass1();
		 
		 System.out.println(obj3.i);
		 System.out.println(obj3.j);
		 obj3.m();
		 obj3.n();
		 obj3.o();
		 
		 System.out.println("=============");
		 CClass1 obj4=(CClass1)obj3;
		 obj4.p();
		 
	}
}