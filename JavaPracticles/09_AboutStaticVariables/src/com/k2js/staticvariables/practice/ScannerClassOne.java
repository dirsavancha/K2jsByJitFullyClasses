// Assignment(HomeWork)Generating Integer Double and String by using Scanner Class and Print String Double Integer

package com.k2js.staticvariables.practice;

import java.util.Scanner;

class  GeneratingValues{
	public static void m(){
		Scanner sc=new Scanner(System.in);
		// Generating Integer Value
		System.out.println("Enter Int value");
		int in=sc.nextInt();
		
		
		
		// Generating double 
		System.out.println("Enter Double value");
		double db=sc.nextDouble();
		
		
		// Generating String value
		System.out.println("Enter String Value");
		String str=sc.next();
		
		
		
		System.out.printf("String value is %s %ndouble value is %f %nint value is %d",str,db,in);
			
		
	}
}

class GeneratingValuesTest{
	public static void main(String...abc){
		GeneratingValues.m();
	}
}