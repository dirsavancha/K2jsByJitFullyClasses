// calling abstract class(Parent)  in to child

package com.k2js.fi.diffrenceofinterface;

abstract class B1 {
	
	int a() {
		return 30;
	}

}

class BChild extends B1{
	void add() {
		System.out.println(BChild.super.a());// child class name.super.method name
	}
}

public class B{
	public static void main(String[] args) {
		BChild bc=new BChild();
		bc.add();
		
	}
}


