// calling methods

package com.k2js.aboutmethods.practice;

class Methods6{
	public Object m(){
		return 10;
	}
	
	public Comparable n(){
		return "20";
	}
	
	static public Object out=new Methods6();
	
	public static void add(){
		Methods6 m1=(Methods6)Methods6.out;
		System.out.println((Integer)m1.m()+Integer.valueOf(m1.n().toString()));
	}
	
}
class Methods6Test{
	public static void main (String...abc){
		Methods6.add();
	}
	
}