// Assignment Adding two values

package com.k2js.aboutmethods.practice;

class Methods14{
	
	public static CharSequence a(StringBuffer s){
		String s1=s.toString();
		Integer i=Integer.valueOf(s1)*2;
		return String.valueOf(i);
		
	}
	
	public Number a(CharSequence s){
		String s1=s.toString();
		Integer i=Integer.parseInt(s1);
		
		return i*i;
	}
	
	public static Object a(String s,int a){
		return new Methods14(){};
	}
		
	public static Number a(int i){
		
		Methods14 m14=(Methods14)Methods14.a("",0);
		int v1=Integer.valueOf(Methods14.a(new StringBuffer("10")).toString()); // Descriptive way
		
		/*
		// Non Descriptive way
		 StringBuffer sb=new StringBuffer("10");
		 CharSequence cs=Methods14.a(sb);
		 String s=cs.toString();
		 int v1=Integer.valueOf(s);
		*/
		int v2=m14.a("10").intValue();
		
		return v1+v2;
	}
		
	
}
class Methods14Test{
	 
	public static void main(String...abc){
		int in=(Integer)Methods14.a(0);
		System.out.println(in);
	}   
}