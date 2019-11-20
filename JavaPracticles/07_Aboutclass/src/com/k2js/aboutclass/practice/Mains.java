// creating main multiple methods

package com.k2js.aboutclass.practice;

class Mains{
	int main(){
		return 10;
	}
	
	public static void main(String s){
		System.out.println(s);
	}
	public static void main(String...abc){
		//System.out.println(abc);
		System.out.println(java.util.Arrays.toString(abc));
	}
}