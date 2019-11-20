//

package com.k2js.polymorphism.practice;

class A3{
	
	static void m(int i){
		System.out.println("i value="+i);
	}
	public static void m(Integer i){
		System.out.println(i);
	}
}
class A3Test{
	public static void main(String...abc){
		int a1=1000;
		A3.m(a1);
		
		Integer a2=2000;
		A3.m(a2);
	}
}