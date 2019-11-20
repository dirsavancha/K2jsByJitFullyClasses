//

package com.k2js.polymorphism.practice;

interface AParent1{
	
	void m();
}

class AChild1 implements AParent1{
	@Override
	public void m(){
		System.out.println("AChild1 class m method ");
	}
}

class AChild2Test{
	public static void main(String...abc){
		
		AChild1 a=new AChild1();
		a.m();
		
		AParent1 b=new AChild1();
		b.m();
	}
}