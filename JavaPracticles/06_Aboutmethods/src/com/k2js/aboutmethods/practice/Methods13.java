// Adding two values

package com.k2js.aboutmethods.practice;

class Methods13{
	static Object a(CharSequence c1){
		  int v1=Integer.valueOf((String)c1);
		return v1*2;
	}
}
class Methods13Test{
	public static void main(String...abc){
		int i=(Integer)Methods13.a("10");
		System.out.println(i*i);
	}
}