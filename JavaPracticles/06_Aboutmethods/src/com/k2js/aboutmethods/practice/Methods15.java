// Adding two values

package com.k2js.aboutmethods.practice;

class Methods15{
	
	public static Comparable c(java.io.Serializable s){
		 Integer i=Integer.valueOf(s.toString());
		return i*2;
	}
	
	public java.io.Serializable c(Comparable c){
		Integer j=Integer.valueOf(c.toString());
		return j*j;
		
	}
	
	public static Object c(String s, StringBuffer s2){
		return new Methods15(){};
	}
	
	public java.lang.constant.Constable c(Number n){
		Methods15 m15=(Methods15)Methods15.c("",new StringBuffer(""));
		Integer v1=Integer.valueOf(Methods15.c((java.io.Serializable)"2").toString());
		Integer v2=Integer.valueOf(m15.c((Comparable)"4").toString());
		
		return v1+v2;
	}
	
}
 class Methods15Test{
	public static void main(String...abc){
		
		
		System.out.println(new Methods15().c((Number)0));
		
	}
}