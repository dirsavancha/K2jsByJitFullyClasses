// calling method (assignment)

package com.k2js.aboutmethods.practice;

class Methods7{
	
	static Object o1=new String(Integer.valueOf(100).toString());
	static Object o2=new Methods7();
	       Object o3=50;
		   
   static void add(){
	   Methods7 m7=(Methods7)Methods7.o2;
	   int v1=Integer.valueOf((String)Methods7.o1);
	   int v2=(Integer)m7.o3;
	   System.out.println(v1+v2);   
   }		   
	
}
class Methods7Test{
	public static void main(String...abc){
		Methods7.add();
	}
}

