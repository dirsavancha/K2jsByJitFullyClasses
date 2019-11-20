// Adding the values

package com.k2js.aboutmethods.practice;

class Methods10{
	
	static Object o(String s){
		return 10.;
	}
	
	Object o(StringBuffer s){
		return 20;
	}
	
	static Object o(CharSequence cs){
		return new Methods10();
	}
	
	public static void a(){
		Methods10 m10=(Methods10)Methods10.o((CharSequence)null);
		Double d10=(Double)Methods10.o("");
		Integer i20=(Integer)m10.o(new StringBuffer());	
		System.out.println(d10+i20);
	}
	
}

class Methods10Test{
	public static void main(String...abc){
		Methods10.a();
	}
}