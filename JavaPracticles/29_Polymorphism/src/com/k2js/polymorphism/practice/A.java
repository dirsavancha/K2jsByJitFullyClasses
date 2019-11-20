//

package com.k2js.polymorphism.practice;

class A{
	
	static void m(int i){
		System.out.println("i value="+i);
	}
}
class ATest{
	public static void main(String...abc){
		int a1=1000;
		A.m(a1);
		
		Integer a2=2000;
		A.m(a2);
	}
}