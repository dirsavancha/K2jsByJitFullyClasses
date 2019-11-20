//

package com.k2js.inheritance.practice;

abstract class A2{
	
	static int i=10;
		   int j=20;
}

class B2 extends A2{
	
		   int i=30;
	static int j=40;
	
	void add(){
		int addition1=A2.i+super.j+this.i+B2.j;
		System.out.println(addition1);
		
	}
	
	static void add(int x){
		B2 obj=new B2();
		int addition2=A2.i+((A2)obj).j+obj.i+B2.j+x;  // upcasted to parent class
		System.out.println(addition2);
		
	}
	
	
}


class B2Test{
	public static void main(String...abc){
		B2 obj=new B2();
		obj.add();
		obj.add(10);
		C obj2=new C();
		obj2.add();
	}
}