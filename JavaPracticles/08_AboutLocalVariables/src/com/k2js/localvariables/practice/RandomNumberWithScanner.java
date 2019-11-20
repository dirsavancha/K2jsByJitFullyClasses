// check the biggest value among one random value and one user input values without return value

package com.k2js.localvariables.practice;

import java.util.Scanner;

class RandomNumberWithScanner{
	public static void m(){
		int i=(int)(Math.random()*1)+10;
		System.out.println(i);
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
		String res=String.valueOf(((i>a)?i:a));
		System.out.println("Biggest value is"+res);
		
	}
}

class RandomNumberWithScannerTest{
	public static void main(String...abc){
		RandomNumberWithScanner.m();
		
	}
}