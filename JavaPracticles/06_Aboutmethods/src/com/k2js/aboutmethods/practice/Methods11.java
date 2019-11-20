// Assigment

package com.k2js.aboutmethods.practice;

class Methods11{
	public static CharSequence cs(Number n){
		CharSequence c1=String.valueOf(n.intValue()*2);
		
		return c1;	
	}
	
	java.io.Serializable cs(Number n1,Number n2){
		int i=Integer.valueOf(n1.intValue()+n2.intValue());
		return i;
	}
	
	static Object  cs(CharSequence cs){
		return new Methods11();
	}
	
	static void add(String s){
		Methods11 m11=(Methods11)Methods11.cs("");
        int a=Integer.valueOf((String)Methods11.cs(10));
		int b=(int)m11.cs(20,30);
		System.out.println(a+b);
		
		
		 }	
}

class Methods11Test{
	public static void main(String...abc){
		Methods11.add("");
	}
}

