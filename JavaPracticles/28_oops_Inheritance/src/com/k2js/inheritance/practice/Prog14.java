// interface --->interface---->interface

package com.k2js.inheritance.practice;
interface A3{
	
	default void print(){
		System.out.println("I am interface A3 print method");
	}
	default String show(){
		return "I am inerface A3 show method";
	}
	
}
interface B3{
	
	default void test(){
		System.out.println("I am interface B3 test method");
	}
	
}
interface C3 extends A3,B3{
	
	default void print(){
		System.out.println("I am interface C3 print method");
	}
	default String show(){
		return "I am inerface C3 show method";
	}
	default void test(){
		System.out.println("I am interface C3 test method");
	}
	
}

class MultipleInheritance_3 {

	public static void main(String[] args) {
		System.out.println("A3 Annonymous ");
		
		A3 obj=new A3(){};
		
		obj.print();
		System.out.println(obj.show());
		
		System.out.println("B3 Annonymous ");
		
		B3 obj1=new B3(){};
		
		obj1.test();
		
		System.out.println("C3 Annonymous ");
		
		C3 obj2=new C3(){};
		
		obj2.print();
		System.out.println(obj2.show());
		obj2.test();
		

	}

}
