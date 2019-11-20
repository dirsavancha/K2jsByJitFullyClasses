// How equals Method executed

package com.k2js.equals.practice;

class Pen2{
	String colour;
	
	Pen2(String c){
		this.colour=c;
		
	}
	@Override          // 1st one
	public String toString(){
		return "colour ="+this.colour;
	}
	public boolean equals(Pen2 p){     // 2nd  one
		return this.colour.equalsIgnoreCase(p.colour);
	}
	@Override      // 3rd one
	public boolean equals(Object o){
		boolean b1=o instanceof Pen2;
		if(!b1)return false;
		Pen2 p=(Pen2)o;
		boolean b2=p.colour.equals(this.colour);
		return b2;
	}
}

class Pen2Test{
	public static void main(String...abc){
		Pen2 p1=new Pen2("Green");
		Pen2 p2=new Pen2("Green");
		System.out.println(p1==p2);  // false
		
		System.out.println(p1.equals(p2));  // fron 2nd //true
		
		Object o1=new Pen2("Green");
		Object o2=new Pen2("Blue");
		System.out.println(p1.equals(o1));  // Getting values from 3rd one from above it should get true
		
		System.out.println(o1.equals(p1));  // Pointing to 1st one and getting result from  3rd one it should get true
		
		System.out.println(o2.equals(p1));  //  Pointing to 1st one and getting result from  3rd one it should get false
		
		System.out.println(o1.equals(02)); //  Pointing to 1st one and getting result from  3rd one it should get false
	}
}
