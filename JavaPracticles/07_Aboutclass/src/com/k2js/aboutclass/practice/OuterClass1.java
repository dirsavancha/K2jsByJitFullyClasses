// Nested Class(Calling static and non static variables and methods to main methods)
//1.main method created inside a nestedCalss and calling
//2.main method is created inside a outerClass and outside a NestedClass and calling 

package com.k2js.aboutclass.practice;

class OuterClass1{
	static int i=10;
		   int j=20;
		   
	static void m(){
		System.out.println("Outer class Static method1");
	}
	
	void m(int i){
		System.out.println("Outer class non static method"+i);
	}
	
	static class StaticNestedClass{
		static int i=30;
		       int j=40;
		static void m(){
			System.out.println("static inner/nested class static method");
		}
		void n(){
			System.out.println("static Nested class Non static method");
		}
		public static void main(String...abc){
			
			// calling outer class Variables
			int a=OuterClass1.i;
			System.out.println(a);  // static variable
			OuterClass1 oc1=new OuterClass1(){};
			System.out.println(oc1.j); // non static variable
			
			//calling outer class methods
			OuterClass1.m();  // static method
			oc1.m(10); // non static method(Object created above)
			
			// Calling Nested Variables
			int s1=OuterClass1.StaticNestedClass.i;
			System.out.println(s1); // static variable in nested class
			OuterClass1.StaticNestedClass obj2=new OuterClass1.StaticNestedClass();
			System.out.println(obj2.j); // non static variable from nested class(Should create object  above)
			
			//calling Nested Class Methods
			StaticNestedClass.m();
			obj2.n();
		}
	}
	public static void main(String...abc){
		
		//calling variables from outerClass
		int a=OuterClass1.i;
		System.out.println(a);
		OuterClass1 oc1=new OuterClass1(){};
		System.out.println(oc1.j);
			
			//calling  from outerClass Static method
			OuterClass1.m();
			oc1.m(10); // used above object  
			
			// Calling NestedClass Variables
			int s1=OuterClass1.StaticNestedClass.i;
			System.out.println(s1);
			OuterClass1.StaticNestedClass obj2=new OuterClass1.StaticNestedClass();
			System.out.println(obj2.j);
			
			//calling Nested Class Methods
			StaticNestedClass.m();
			obj2.n();
	}
	
}