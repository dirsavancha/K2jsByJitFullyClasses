// Adding two values

package com.k2js.aboutmethods.practice;

class Methods12{
	static Comparable a(){
		return 10;
	}	
	
	Object a(String s){
		return 20;
	}
	
	static Object a(Object o){
		
		return new Methods12();
	}
	
	static int a(int i){
		Methods12 m12=(Methods12)Methods12.a(0.);
		int v1=(Integer)Methods12.a();
		//int v1=Integer.valueOf(m12.a().toString());
		int v2=(Integer)m12.a("");
		System.out.println(v1+v2);
		return 10+20;
	}

}

class Methods12Test{
	public static void main(String...abc){
		Methods12.a();
	}
}


