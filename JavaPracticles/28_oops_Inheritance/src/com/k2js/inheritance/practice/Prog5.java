// Multi Level Inheritance

package com.k2js.inheritance.practice;

class A2{
	
	int g=100,h=200,i=300;
	
	void l(){
		System.out.println("I am Parent class l method");
	}
	
	void m(){
		System.out.println("I am Parent class m method");
	}
	void p(){
		System.out.println("I am Parent class p method");
	}
	
}

class B2 extends A2{
	
	int i=400,j=500,h=600;
	
	
	public void m(){
		System.out.println("I am child class B2 m method");
	}
	
	public void n()
	{
		System.out.println("I am child class B2 n method");
	}
}

class C2 extends B2{
	
	int j=700,k=800,g=900;
	
	public void n(){
		System.out.println("I am child class c2 n method");
	}
	
	public void o(){
		System.out.println("I am child class c2 o method");
	}
	public void p(){
		System.out.println("I am child class c2 p method");
	}
}

class C2Test{
	
	public static void main(String...abc){
		System.out.println("1st possibility");
		
		C2 c1=new C2();
		
		int a=c1.g;
		System.out.println(a);
		int b=c1.h;  // c class 
		System.out.println(b);
		int c=c1.i;  // B class 
		System.out.println(c);
		int e=c1.j;  // B class 
		System.out.println(e);
		int f=c1.k;
		System.out.println(f);
		c1.l();
		c1.m();
		c1.n();
		c1.o();
		c1.p();
		/*  output
900
600
400
700
800
I am Parent class l method
I am child class B2 m method
I am child class c2 n method
I am child class c2 o method
I am child class c2 p method
		*/
		
		System.out.println("2nd possibllty");
		
		A2 a1=new C2();
		
		int aa=a1.g;
		System.out.println(aa);
		int bb=a1.h;
		System.out.println(bb);
		int cc=a1.i;
		System.out.println(cc);
		//int dd=a1.j;
		//System.out.println(dd);
		
		
		a1.l();
		a1.m(); // Compile time polymorphysm
		a1.p();  // Run Time Polymorphysim
		
		/*
		output
		
100
200
300
I am Parent class l method
I am child class B2 m method
I am child class c2 p method
		*/
		 System.out.println("3rd possibility");
		 
		C2 c2=(C2)a1;
		int aaa=c2.i;
		System.out.println(aaa);
		int bbb=c2.j;
		System.out.println(bbb);
		int ccc=c2.k;
		System.out.println(ccc);
		
		c2.l();
		c2.m();
		c2.n();
		c2.o();
		c2.p();
	}
}