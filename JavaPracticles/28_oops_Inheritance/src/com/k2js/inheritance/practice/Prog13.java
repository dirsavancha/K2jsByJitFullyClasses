// Interface --->Interface--->Class

package com.k2js.inheritance.practice;
interface A1{
	
	default void print(){
		System.out.println("I am interface A1 print method");
	}
	
	default Integer show(){
		return 20;
	}
	
}
interface  B1{
	
	default void print(){
		System.out.println("I am interface B1 print method");
	}
	
	default String test(){
		
		return "I am interface B1 test method";
	}
	
}
class C1  implements A1,B1{
	
	public void print(){
		System.out.println("I am Class C1 print method");
	}
	
	public Integer show(){
		return 30;
	}
	
	public String test(){
		return "I am Class C1 test method";
	}
	
	
}


 class MultiplrInheritance_2 {

	public static void main(String[] args) {
		
		C1 obj1=new C1();
		
		obj1.print();
		System.out.println(obj1.show());
		System.out.println(obj1.test());
		
		System.out.println("=======");
		B1 obj2=new C1(); // parent B1 refers to child class C1
                                                                    

		obj2.print();
		//System.out.println(obj2.show());
		System.out.println(obj2.test());
		
		System.out.println("=======");
		A1 obj3=new C1(); // Parent A1 refers to child class C1
		obj3.print();
		System.out.println(obj3.show());
		//System.out.println(obj3.test());
		
		System.out.println("Annonymous class For interface A ");
		
		A1 obj4= new A1(){};
		obj4.print();
		System.out.println(obj4.show());
		
		System.out.println("Annonymous class For interface B ");
		
		B1 obj5=new B1(){};
		obj5.print();
		System.out.println(obj5.test());
		
		
		
		
		

	}

}
