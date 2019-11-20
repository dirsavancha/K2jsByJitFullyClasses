// calling static variables

package com.k2js.staticvariables.practice;

class StaticVariablesClass{
	static int i=1000;
	
	public static void m(){
		// 1. Way of calling
		System.out.println("1. Using Class Name");
		System.out.println(StaticVariablesClass.i);
		
		// 2. Way of calling
		StaticVariablesClass svc=null;
		System.out.println("2. ref variable");
		System.out.println(svc.i);
		
		System.out.println(((StaticVariablesClass)null).i); // Herae Jvm is maintained 
		
		// 3. Way of calling
		StaticVariablesClass svc_c=new StaticVariablesClass(){};
		System.out.println("3. ref variables that stored same class Object");
		System.out.println(svc_c.i);
		// or 
		System.out.println(new StaticVariablesClass(){}.i);
		
		// 4. Way of calling
		System.out.println("4. Ref that store same class Object");
		StaticVariablesClass svc_obj=new StaticVariablesClass();
		System.out.println(svc_obj.i);
		//or
		System.out.println(new StaticVariablesClass().i);
		
		// 5. Way of calling
		System.out.println("Directly variable name");
		System.out.println(i);

		
	}
}

class StaticVariablesClassTest{
	public static void main(String...abc){
		StaticVariablesClass.m();
	}
}