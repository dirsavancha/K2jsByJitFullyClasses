//Mutable and Immutable

package com.k2js.encapsulation.practice;

class MuImmu{
	
	static  void m (  final int i){ //   if static  void m ( final int i) error: final parameter i may not be assigned
		i=20;
	}
	static  void m ( Integer i){  //  If static  void m ( final Integer i)error: final parameter i may not be assigned if 
		i=5000;
	}
	
	static void m ( final String s){
		s=s.concat("world");  //  error: final parameter s may not be assigned
		//s.concat("world");
	}
	
	static void m( final StringBuffer sb){
		//sb.reverse();
		sb.append("Selenium");
	}
	
}

class MuImmuTest{
	public static void main(String...abc){
		int a=10;
		MuImmu.m(a);
		System.out.println(a);
		Integer a2=new Integer(2000);
		MuImmu.m(a2);
		System.out.println(a2);
		
		String str=new String("Hello");
		MuImmu.m(str);
		System.out.println(str);
		StringBuffer sb=new StringBuffer("Java");
		MuImmu.m(sb);
		System.out.println(sb);
		
	}
}