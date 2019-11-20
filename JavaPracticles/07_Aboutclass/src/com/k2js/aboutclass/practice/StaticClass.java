// Creating Static class inside a class
package com.k2js.aboutclass.practice;

class A{
	
	static class B{
		static int i=10;
			   int j=20;
		static int i(){
			B obj=new B();
			int a=obj.j;
			int add=i+a;
		return add;	
		}
		int j(){
			int b=B.i; // calling static variable in to non static method and storing it
			int add2=(b+j)+b;
		return add2;
		}
		public static void main(String...abc){
			B obj1=new B();
			System.out.println("I am Static variable "+B.i);
			System.out.println("I am Non static variable "+obj1.j);  
			System.out.println(B.i());
			System.out.println(obj1.j());
			
		}
	}
}

