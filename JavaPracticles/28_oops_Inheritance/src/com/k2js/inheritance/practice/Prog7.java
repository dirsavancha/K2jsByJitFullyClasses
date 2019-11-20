// Single Level Inheritance
// Interface ----->class 

package com.k2js.inheritance.practice;

interface A4{
	//int a=100,b=200;
	
	default void printMethod(){
		System.out.println("I am Interface A clas Print method");
	}
	
	default String testMethod(){
		return "I am Interface A class test method";
	}
}
class A4Impl implements A4{
	int a=300,c=400;
	
	@Override
	public void printMethod(){
		System.out.println("I am Class A4Impl print method");
	}
	
	
}


 class A4ImplTest {

	public static void main(String[] args) {
		
		System.out.println("1st  possibility");
		A4Impl obj= new A4Impl();
		System.out.println(obj.a);
		System.out.println(obj.c);
		//System.out.println(obj.b);
		obj.printMethod();
		System.out.println(obj.testMethod());
		
		System.out.println("2nd  possibility");
		
		A4 obj1=new A4Impl();
		//System.out.println(obj1.a);
		//System.out.println(obj1.b);
		//System.out.println(obj1.c);
		 obj.printMethod();
		 obj1.testMethod();
		 
		 System.out.println("3rd  possibility");
		 
		 A4 obj2=(A4Impl)obj;
		 
		 obj2.printMethod();
		 System.out.println(obj2.testMethod());
		
		
		
		
		

	}

}
