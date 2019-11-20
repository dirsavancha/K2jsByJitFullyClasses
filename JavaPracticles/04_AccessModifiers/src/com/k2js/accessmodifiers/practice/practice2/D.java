// Accessing a class members from one package to another package
// instead of Object creating for a member class(A),we can write a fully qualified name of that package.class 
// we can't access private default and protected beacuse it is in another package

package com.k2js.accessmodifiers.practice.practice2;

class D{
	
	public static void main(String...abc){
		com.k2js.accessmodifiers.practice.A a1=new com.k2js.accessmodifiers.practice.A();
		
		System.out.println("I am public"+a1.i4);
		//System.out.println("I am public"+a1.i2);
		//System.out.println("I am public"+a1.i3);
		//System.out.println("I am public"+a1.i1);
	}
}