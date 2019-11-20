// calling static variables

package com.k2js.staticvariables.practice;

class StaticVariablesClass2{
	static int i=1000;
	
	public  void m(){
		// 1. Way of calling
		System.out.println("1. Using Class Name");
		System.out.println(StaticVariablesClass2.i);
		
		// 2. Way of calling
		StaticVariablesClass2 svc=null;
		System.out.println("2. ref variable");
		System.out.println(svc.i);
		
		System.out.println(((StaticVariablesClass2)null).i); // Herae Jvm is maintained 
		
		// 3. Way of calling
		StaticVariablesClass2 svc_c=new StaticVariablesClass2(){};
		System.out.println("3. ref variables that stored same class Object");
		System.out.println(svc_c.i);
		// or 
		System.out.println(new StaticVariablesClass2(){}.i);
		
		// 4. Way of calling
		System.out.println("4. Ref that store same class Object");
		StaticVariablesClass2 svc_obj=new StaticVariablesClass2();
		System.out.println(svc_obj.i);
		//or
		System.out.println(new StaticVariablesClass2().i);
		
		// 5. Way of calling
		System.out.println("Directly variable name");
		System.out.println(i);
		System.out.println("Using this keyword");
		System.out.println(this.i);

		
	}
}

class StaticVariablesClass2Test{
	public static void main(String...abc){
		StaticVariablesClass2 obj=new StaticVariablesClass2();
	     obj.m();
	}
}