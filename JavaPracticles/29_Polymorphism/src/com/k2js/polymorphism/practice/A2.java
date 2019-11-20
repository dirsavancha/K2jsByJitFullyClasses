//

package com.k2js.polymorphism.practice;

class A2{
	
	
	public static void m(Integer i){
		System.out.println("i value is"+i);
	}
}
class A2Test{
	public static void main(String...abc){
		int a1=1000;
		A2.m(a1);
		
		Integer a2=2000;
		A2.m(a2);
	}
}