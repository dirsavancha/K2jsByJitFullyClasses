// Adding two values

package com.k2js.aboutmethods.practice;

 class Methods9{
	 
	static Object o1(String s){
		return new String(40+"");
	}
	
	Object o1(Object s){
		return  
	}
	
	static Object o1(String s, Object s1){
		return new Methods9();
	}
	
	static Object add(){
		/*
		Method9 m9=(Method9)Method9.o1(null,null);
		nt i40=Integer.valueOf((String)Method9.o1(null));
		int i50=Integer.valueOf((String)m9.01(0));
		System.out.println(i40+i50);
		*/
		
		Methods9 obj=new Methods9();
		String s1=obj.o1(0).toString();
		String s2=String.valueOf(((String)(Methods9.o1(40+""))));
		
		int i= Integer.parseInt(s1);
		int j=Integer.parseInt(s2);
		System.out.println(i+j);
		return new String(50+"40");
	}
}

class Methods9Test{
	public static void main(String...abc){
		Methods9.add();
	}
}