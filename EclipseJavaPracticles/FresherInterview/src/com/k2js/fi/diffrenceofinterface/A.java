// abstarct interface(Parent) methods can call in to child class by super as below

package com.k2js.fi.diffrenceofinterface;

abstract interface A1 {
	default int a() {
		return 20;
	}

}

class AChild implements A1 {
	void add() {
		System.out.println(A1.super.a()); // parent class name.super.method name
	}
}

public class A{
	public static void main(String[] args) {
		AChild ac=new AChild();
		ac.add();
	}
}
