
// Adding two values 

package com.k2js.aboutmethods.practice;

class Methods8{
	static java.lang.constant.Constable m(){
		return "50";
	}
	
	java.lang.constant.ConstantDesc n(){
		return 20;
	}
	
	static Object objRef(){
		return new Methods8();
	}
	
	static void add(){
		Methods8 m1=(Methods8)Methods8.objRef();
		int v1=Integer.valueOf((String)Methods8.m());
		int v2=(Integer)m1.n();
		System.out.println(v1+v2);
		
	}
	
}
class Methods8Test{
	public static void main(String...abc){
		Methods8.add();
		
	}
}













//Compile Should done in java12 
//..\..\..\..\Tools\Java\jdk-12\bin\javac -d ..\bin com\k2js\aboutmethods\practice\Methods8.java