// Writing Three ways of class

package com.k2js.aboutclass.practice;

class Normal{
	void m(int i){
		System.out.println("Hello Normal Class");
	}
}

class UnBounded<T>{
	void m(T t){
		System.out.println("Hello UnBounded Class"+t);
	}
}

class Bounded<T extends CharSequence>{
	void m(T t){
		System.out.println(t+"Hello Bounded Class");
	}
}

class N_Un_B_Test{
	public static void main(String...abc){
		Normal n1=new Normal();
		n1.m(10);
		
		UnBounded<Integer> u1=new UnBounded<Integer>();  // After java1.7 we can write UnBounded<Integer> u1=new UnBounded<>();
		u1.m(10);
		
		Bounded<StringBuffer> b1=new Bounded<StringBuffer>();
		b1.m(new StringBuffer("Hello"));
	}
}