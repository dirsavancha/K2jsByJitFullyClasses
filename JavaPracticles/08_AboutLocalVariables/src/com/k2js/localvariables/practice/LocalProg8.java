//Assignment find the biggest value

package com.k2js.localvariables.practice;

import java.util.Scanner;
class Prg11{
	public static int bigNum(){
		int i=(int)(Math.random()*10)+1;
		System.out.println(i);
		
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		
		
		return i>j?i:j;
		
	}
	
}
class Prg11Test{
	public static void main(String...abc){
		int bn=Prg11.bigNum();
		System.out.println("big number is"+bn);
	}
}