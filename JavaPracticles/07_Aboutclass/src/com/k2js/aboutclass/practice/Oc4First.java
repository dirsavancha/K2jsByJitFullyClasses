
package com.k2js.aboutclass.practice;

enum Oc4 {
	x;
	        int i=30;
	static int j=40;
	
	int m(){
		return 10;
	}
	
	static int m(Object o){
		int b=(Integer)o;
		return b;
	}
	static class E1{
		  	   int i=1000;
		static int j=2000;
		
		Object m(Comparable c){
			int d=(Integer)c;
			return d;
		}
		
		static Comparable m(Object o){
			 int f=(Integer)o;
			return f;
		}
		public static void main(String...abc){
			// Calling enum variables
			System.out.println(x.i);
			System.out.println(Oc4.x.j);
			
			// calling enum methods
			int a=x.m();
			System.out.println(a);
			int b=x.m(20);
			System.out.println(b);
			//calling static class E1 variables
			E1 obj=new E1();
			System.out.println(obj.i);
			System.out.println(E1.j);
			//calling static class E1 methods
			
			System.out.println(new Oc4.E1().m(3000));
			System.out.println(new Oc4.E1().m(4000);
			
		
		}
	}
}