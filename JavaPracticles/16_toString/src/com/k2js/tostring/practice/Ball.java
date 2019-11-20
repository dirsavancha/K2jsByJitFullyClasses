//

package com.k2js.tostring.practice;

class Ball{
	String colour,game;
	
	Ball(String c, String g){
		this.colour=c;
		this.game=g;
		
	}
}

class BallTest{
	public static void main(String...abc){
		Ball b1=new Ball("Yellow","Tennis");
		Ball b2=new Ball("Yellow","Tennis");
		Ball b3=new Ball("White","Cricket");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}