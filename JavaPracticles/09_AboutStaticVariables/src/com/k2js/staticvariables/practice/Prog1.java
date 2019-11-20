// Assignment Addition of two Numbers

package com.k2js.staticvariables.practice;

class Prog1{
	static Comparable c="30";  // Agregation
	       Object o=40;  // Composition
		   

	public void add(int c,int o){
		
		int v1=Integer.valueOf(Prog1.c.toString());
	    int v2=(Integer)this.o;
		System.out.println(v1+v2+c+o); 	
	}
	
	public static void add(){
		int v3=Integer.valueOf(Prog1.c.toString());
		int v4=(Integer)new Prog1().o;
		System.out.println(v3+v4);
	}
	
}

class Prog1Test{
	public static void main(String...abc){
		new Prog1().add(1000,2000);
		Prog1.add();
	}
}