//Multi Level Inheritance

// Interface --->Interface--->Class
package com.k2js.inheritance.practice;


interface A10{
	
	
	default void m(){
		System.out.println("I am Parent Interface of m Method");
	}
	
	default int n(){
		return 100;
	}	

		
}
interface B10 extends A10{
	

	
	
	default  void p(){
		System.out.println("I am Child B10 Class of p Method");
	}
	
	default void o(){
		System.out.println("I am child B10 Class of o Method");
	}
}
interface  C10 extends B10{
	
	default  void m(){
		System.out.println("I am Child C10 Class of m Method");
	}

	default void p(){
		System.out.println("I am child C10 Class of p Method");
	}
}
/*class Impl implements B10{
	int i=100,j=200;
	public void m(){
		System.out.println("I am Child impl Class of m Method");
	}

	public void p(){
		System.out.println("I am child impl Class of p Method");
	}
}*/

class B10Test{
	public static void main(String...abc){
		C10 obj=new C10(){};
		
		obj.m();
		System.out.println(obj.n());
		obj.o();
		obj.p();
		
		/*A10 obj2=new Impl();
		
		obj2.m();
		System.out.println(obj2.n());
		//obj2.o();
		//obj2.p();
		
		B10 obj3=new Impl();
		
		obj3.m();
		System.out.println(obj3.n());
		obj3.o();
		obj3.p();
		
		B10 obj4=(B10)obj;
		obj4.m();
		System.out.println(obj4.n());
		obj4.o();
		obj4.p();*/
		
		
	}
}