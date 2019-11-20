//

package com.k2js.inheritance.practice;

abstract class A1{
	int i=10;
	static int j=20;
}

class B1 extends A1{
	int a=30;
	static int b=40;
	
	
	void add(){
		
		int addition=super.i+A1.j+this.a+B1.b;
		System.out.println("Total value is"+addition);
	}
	
	static void add(int x){
		
		B1 obj=new B1();
		
		int addition2=obj.i+A1.j+obj.a+b+x;
		System.out.println("Final value is"+addition2);
	}
}

class B1Test{
	
	public static void main(String...abc){
		B1 obj=new B1();
		
		obj.add();
		obj.add(10);
	}
}