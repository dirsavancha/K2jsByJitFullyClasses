//

package com.k2js.polymorphism.practice;

class B1{
	
	static void m(String j){
		System.out.println("String");
	}
}

class B2 extends B1{
	
	static void m(Object o){
		System.out.println("Object");
	}
		static void m(Integer i){
		System.out.println("Integer");
	}

}

class B2Test{
	public static void main(String...abc){
		//B1.m(null);
		B2.m((Integer)null);
		
		
	}
}