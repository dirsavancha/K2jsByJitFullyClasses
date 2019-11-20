//Multiple  statements 

// if condition will take only true

package com.k2js.conditions.ifelsepractice;

class IfPro2{
		public static void m(){
			System.out.println("Method Start Statement");
			if(!false)
			{
				System.out.println("Hello");
				System.out.println("World");
			}	
			System.out.println("Method last statement");
		}
}

class IfPro2Test{
	public static void main(String...abc){
		IfPro2.m();
	}
}