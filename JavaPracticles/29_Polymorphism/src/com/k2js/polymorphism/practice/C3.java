//

package com.k2js.polymorphism.practice;

interface AParent1{
	
	default void m(){
		System.out.println("defult AParent1 m method");
	}
	
}

class AParent2{
	
	 void m(){    // Here if you not public it will throw error we can over come in AChild1 class 
		System.out.println("AParent2 class m method");
	}
}
class  AChild1 extends AParent2 implements AParent1{
	
	@Override
	public void m(){  // Here we give public to over come above error
		super.m();
		AParent1.super.m();
		AChild1.super.m();
	}
}

class AChild2Test3{
	
	public static void main(String...abc){
		AChild1 ac1=new AChild1(){};
		ac1.m();
		
		AParent1 ap1=new AChild1(){};  // Run time Polymorphism (when a child pointing to parent is know as run time polymorphism)
		ap1.m();
		
	}
}