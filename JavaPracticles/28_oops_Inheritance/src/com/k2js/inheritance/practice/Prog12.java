//  Multiple inheritance

// class ---- childclass
// interface --- childclass

package com.k2js.inheritance.practice;

abstract class AClass11{
	
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
interface Ainterface11{

	default void m(){
		System.out.println("A interface1 method m");
	}
	
	void n();
	void q();
	default void r(){
		System.out.println("I am interface r method");
	}
	
}
abstract class CClass11 extends AClass11 implements Ainterface11{
	void p(){
			System.out.println("I am CClass11 p method");
		}
	public static void main(String...abc){
	
		CClass11 one=new CClass11(){  //Annonymous class
		@Override
		public void q(){
			System.out.println("I am annonymous q method");
		}
		
		};
		System.out.println(one.i);
		System.out.println(one.j);
		one.m();
		one.n();
		one.o();
		one.p();
		one.q();
		one.r();
	}
}
	

		
		
		