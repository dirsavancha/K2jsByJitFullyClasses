//

package com.k2js.inheritance.practice;


abstract class A3{
	
	static int i(){
		return 10;
	}
	int j(){
		return 20;
	}
} 

class B3 extends A3{
	
	static int i(){
		return 30;
	}
	
	@Override
	int j(){
		return 40;
	}
	
	void add(){
		B3 obj=new B3();
		int addition1=A3.i()+super.j()+B3.i()+this.j();
		System.out.println(addition1);
	}
	static void add(int x){
		B3 b3=new B3();
		//int addition2=A3.i()+((A3)obj).j()+B3.i()+x;// not possible  up casting in methods , instead of that we want to crate Anonymous class object
		int addition2=A3.i()+new A3(){}.j()+B3.i()+obj.j()+x;
	
	
		System.out.println(addition2);
		
	}
}

class B3Test{
	public static void main(String...abc){
		B3 obj=new B3();
		obj.add();
		obj.add(10);
	}
}