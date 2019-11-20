
// Generating Random Characters
package com.k2js.localvariables.practice;

class Lp6{
	public static void m(){
		//char i=(char)(Math.random()*('A'+('Z'-'A')+1)+'A');
		//char i=(char)(Math.random()*(('z'-'a')+1)+'a'); // for small Letters
		char i=(char)(Math.random()*('z'-'a'+1)+'a'); 


		System.out.println(i);
	} 
}

class Lp6Test{
	
	public static void main(String...abc){
		Lp6.m();
	}
}