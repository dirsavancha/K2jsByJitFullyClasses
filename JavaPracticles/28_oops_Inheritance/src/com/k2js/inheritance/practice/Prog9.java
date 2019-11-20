//Multi Level Inheritance

// Interface --->Class--->Class
package com.k2js.inheritance.practice;


interface A9{
	default void m(){
		System.out.println("I am Parent Interface of m Method");
	}
	
	default int n(){
		return 100;
	}	

		
}
class B9 implements A9{
	int i=200, j=300;
	
	
	public void p(){
		System.out.println("I am Child B9 Class of p Method");
	}
	
	void o(){
		System.out.println("I am child B9 Class of o Method");
	}
}
class C9 extends B9{
	int i=400, j=500;
	public void m(){
		System.out.println("I am Child C9 Class of m Method");
	}

	public void p(){
		System.out.println("I am child C9 Class of p Method");
	}
}

class C9Test{
	public static void main(String...abc){
		
		System.out.println("1st possibility");
		C9 obj=new C9();
		System.out.println(obj.i);
		System.out.println(obj.j);
		obj.m();
		System.out.println(obj.n());
		obj.o();
		obj.p();
		
			
		System.out.println("2nd possibility");
		
		B9 obj1=new B9();
		
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		obj1.m();
		System.out.println(obj1.n());
		obj1.o();
		obj1.p();
		
		System.out.println("3rd possibility");
		
		A9 obj2=(A9)obj; //A9 obj3=(C9)obj1
			
		obj2.m();
		System.out.println(obj2.n());
		
	}
}
