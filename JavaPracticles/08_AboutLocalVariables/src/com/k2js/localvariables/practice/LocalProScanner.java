// using Scanner Class

package com.k2js.localvariables.practice;

import java.util.Scanner;

class prg10{
	public static void m(){
		int i=(int)(Math.random()*10)+10;
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		System.out.println(j);
		sc.nextLine();
		String s=sc.nextLine();
		System.out.println(s);
	}
}
class Prg10Test{
	public static void main(String...abc){
		prg10.m();
	}
}