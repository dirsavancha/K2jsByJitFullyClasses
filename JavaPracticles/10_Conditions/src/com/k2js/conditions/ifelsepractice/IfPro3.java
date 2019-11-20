// Ifelse Condition
 

package com.k2js.conditions.ifelsepractice;

class IfPro3{
	
	
	public static void m(){
		
		 Object o=(int)(Math.random()*6)+1;
		
		int v=(Integer)o;
		
		if(v==1){
			System.out.println("One");
		}
		else if(v==2){
			System.out.println("Two");
		}
		else if(v==3){
			System.out.println("Three");
		}
		else if(v==4){
			System.out.println("Four");
		}
		else if(v==5){
			System.out.println("Five");
		}
		else{
			System.out.println("I don't Know");
		}
	}
}

class IfPro3Test{
	public static void main(String...abc){
		IfPro3.m();
	}
}