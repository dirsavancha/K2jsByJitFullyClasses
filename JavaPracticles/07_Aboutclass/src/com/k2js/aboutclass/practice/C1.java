// Creating Local inner Class

package com.k2js.aboutclass.practice;

class C1{
	static int i=10;
	       int j=20;
    static void m(){
		System.out.println("C1 static method");
	}			
	
	void n(){
		System.out.println("Non Static method");
	}
	
	public static void main(String...abc){
		int i=30;
		class LocalInnerClass{
			final static int k=30;
			             int j=40;
			void m(){
				System.out.println("Local Non Static Method");
			}			 
	}
		System.out.println(i);
		System.out.println(LocalInnerClass.k);
		
		System.out.println(new LocalInnerClass().j);
		
		new LocalInnerClass().m();
		
		C1.m();
		new C1().n();
		
		
	}
}