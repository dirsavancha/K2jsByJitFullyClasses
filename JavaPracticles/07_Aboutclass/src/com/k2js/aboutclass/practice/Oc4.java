// About enum

package com.k2js.aboutclass.practice;

class Oc4{
	       int i=30;
	static int j=40;
	
	int m(){
		return 10;
	}
	
	static int m(Object o){
		int b=(Integer)o;
		return b;
	}
	
	enum E1{
		x;
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
			Oc4 obj=new Oc4();
			System.out.println(obj.i);
			System.out.println(Oc4.j);
			int a =obj.m();
			System.out.println(a);
			int c=Oc4.m(20);
			System.out.println(c);
			System.out.println(Oc4.E1.x.i);
			System.out.println(E1.x.j);
			System.out.println(Oc4.E1.x.m(3000));
			System.out.println(x.m(4000));	
			
			
		}
	}
	public static void main(String...abc){
			Oc4 obj=new Oc4();
			System.out.println(obj.i);
			System.out.println(Oc4.j);
			int a =obj.m();
			System.out.println(a);
			int c=Oc4.m(20);
			System.out.println(c);
			System.out.println(Oc4.E1.x.i);
			System.out.println(E1.x.j);
			System.out.println(Oc4.E1.x.m(3000));
			System.out.println(E1.x.m(4000));	
			
		}
}

class Oc4Test{
	public static void main(String...abc){
			Oc4 obj=new Oc4();
			System.out.println(obj.i);
			System.out.println(Oc4.j);
			int a =obj.m();
			System.out.println(a);
			int c=Oc4.m(20);
			System.out.println(c);
			System.out.println(Oc4.E1.x.i);
			System.out.println(Oc4.E1.j);
			System.out.println(Oc4.E1.x.m(3000));
			System.out.println(Oc4.E1.x.m(4000));	
			
		}
}