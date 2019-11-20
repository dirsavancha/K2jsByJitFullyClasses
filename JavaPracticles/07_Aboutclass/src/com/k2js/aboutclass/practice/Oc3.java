// Interface inside a class

package com.k2js.aboutclass.practice;

class Oc3{
	static int i=10;
	       int j=20;
	static void m(){
		System.out.println("Outer class static method 1");
	}	
	
	void m(int i){
		System.out.println("Outer class Non static method"+i);
	}
	
	interface I1{
		       int i=30;
		static int j=40;
		
		default void n(){
			System.out.println("Non static in interface");
		}
		
		static void m(){
			System.out.println("I am interface static");
		}
		public static void main(String...abc){
			
			System.out.println(Oc3.i);
			Oc3 obj=new Oc3();
			System.out.println(obj.j);
			Oc3.m();
			obj.m(100);
			
			//Calling Interface I1 variables
			System.out.println(Oc3.I1.i);  // Non static variable from Interface class
			System.out.println(Oc3.I1.j);  // Static variable from Interface class
			
			// Calling Interface I1 Methods
			Oc3.I1.m(); // static method from Interface class
			
			Oc3.I1 obj1 =new Oc3.I1(){};
			new Oc3.I1(){}.n();
			
		}
		
	}
	public static void main(String...abc){
			
			System.out.println(Oc3.i);
			Oc3 obj=new Oc3();
			System.out.println(obj.j);
			Oc3.m();
			obj.m(100);
			
			//Calling Interface I1 variables
			System.out.println(Oc3.I1.i);  // Non static variable from Interface class
			System.out.println(Oc3.I1.j);  // Static variable from Interface class
			
			// Calling Interface I1 Methods
			Oc3.I1.m(); // static method from Interface class
			
			Oc3.I1 obj1 =new Oc3.I1(){};
			new Oc3.I1(){}.n();
			
		}
	
}

class Oc3Test{
	
	public static void main(String...abc){
			
			System.out.println(Oc3.i);
			Oc3 obj=new Oc3();
			System.out.println(obj.j);
			Oc3.m();
			obj.m(100);
			
			//Calling Interface I1 variables
			System.out.println(Oc3.I1.i);  // Non static variable from Interface class
			System.out.println(Oc3.I1.j);  // Static variable from Interface class
			
			// Calling Interface I1 Methods
			Oc3.I1.m(); // static method from Interface class
			
			Oc3.I1 obj1 =new Oc3.I1(){};
			new Oc3.I1(){}.n();
			
		}
}