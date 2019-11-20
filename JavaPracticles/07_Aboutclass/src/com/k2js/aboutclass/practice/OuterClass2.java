// Class 2

package com.k2js.aboutclass.practice;

class OuterClass2{
	static int i=10;
	       int j=20;
		   
	static void m(){
		System.out.println("Outer Class static method 1");
	}	
	
	void m(int i){
		System.out.println("Outer class non static method"+i);
	}
	
	class NonStaticNestedClass{
		final static int i=30;
					 int j=40;
		void m(){
		System.out.println("I am nonstatic inner class method n()");
	}	
	
	}
	public static void main(String...abc){
		
		System.out.println(OuterClass2.i);
		
			OuterClass2 oc1=new OuterClass2(){};
			
			System.out.println(oc1.j);
			
			//callingStatic method
			OuterClass2.m();
			oc1.m(10);
			
			// calling nested class variables
			System.out.println(OuterClass2.NonStaticNestedClass.i);
			
			OuterClass2.NonStaticNestedClass ocnm=oc1.new NonStaticNestedClass();
			System.out.println(ocnm.j);
			
			ocnm.m();
	}
}