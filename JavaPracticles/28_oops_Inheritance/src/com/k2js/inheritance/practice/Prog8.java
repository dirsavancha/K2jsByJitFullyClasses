//single Level inheritance
// Interface ----->Interface
//// Use "default" to overcome this error A8.java:6: error: interface abstract methods cannot have body

package com.k2js.inheritance.practice;

interface A5{
	
	default void m(){
		System.out.println("I am interface Parent class m method");
	}
	
	default int n(){
		return 500; 
	}
	
}
interface B5 extends A5{
	
	default void m(){
		System.out.println("I am interface child class m method");
	}
	
}

/*class C5Impl implements B5{
	int a=600,b=700;
	
	public void m(){
		System.out.println("I am implementation class m method");

	}
	
}*/

class C5ImplTest {
	public static void main(String[] args) {
		
		System.out.println("1st possibility");
		B5 obj= new B5(){};
		 
	
		
		obj.m();
		System.out.println(obj.n());
		
		/*System.out.println("2nd possibility");
		A5 obj1= new C5Impl();
		obj1.m();
		System.out.println(obj1.n());
		
		System.out.println("3rd possibility");
		
		A5 obj2=(C5Impl)obj;
		
		obj2.m();
		System.out.println(obj2.n());*/
		
		
	}

}