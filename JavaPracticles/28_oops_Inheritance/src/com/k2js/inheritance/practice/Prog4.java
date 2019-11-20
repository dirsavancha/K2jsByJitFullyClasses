// Single levelInheritance

package com.k2js.inheritance.practice;

class A1{
	
	int i=100,j=200;
	
	void m(){
		System.out.println("I am Parent class m method");
	}
	
	void n(){
		System.out.println("I am Parent class n method");
	}
	
}

class B1 extends A1{
	
	int j=300,k=400;
	
	//@Override
	public void n(){
		System.out.println("I am child class n method");
	}
	
	public void o()
	{
		System.out.println("I am child class o method");
	}
}

class B1Test{
	
	public static void main(String...abc){
		// One method
		B1 b1=new B1();
		int x=b1.i;
		System.out.println(x);
		int y=b1.j;
		System.out.println(y);
		int z=b1.k;
		System.out.println(z);
		b1.m();
		b1.n(); // Compile time polymorphysm
		b1.o();
		
		// Output 
		/*
100
300
400
I am Parent class m method
I am child class n method
I am child class o method
		*/
		
		// Another Possibility
		
		
		System.out.println("2nd possibility");
		A1 a1=new B1();  // --------> UpCasting
		
		int one=a1.i;
		System.out.println(one);
		int two=a1.j;
		System.out.println(two);
		a1.m();
		a1.n();   //  --------> RunTime Polymorphysim
		
/* Output		
100
200
I am Parent class m method
I am child class n method */


// Another Possibility

  System.out.println("3rd possibility");
  
   B1 b2 =(B1)a1; //----> Downcasting
   
  
		int aa=b2.i;
		System.out.println(aa);
		int bb=b2.j;
		System.out.println(bb);
		int cc=b2.k;
		System.out.println(cc);
		b2.m();
		b2.n(); // Compile time polymorphysm
		b2.o();
  
  
  /*
  3rd possibility
100
300
400
I am Parent class m method
I am child class n method
I am child class o method
  */
  
		
	}
}