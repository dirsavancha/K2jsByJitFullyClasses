// pick the digit and print the number of values

package com.k2js.loops.practice;

class Forloop5{
	
	public static void method(){
		int i=4786329;
	    int sum=0;
			for(int a=i;a!=0;a/=10){
				int digit=a%10;
				for(int v=1;v<=digit;v++){
					System.out.print(v+"\t");
				}
				System.out.println();
			}
	}
}

class Forloop5Test{
	public static void main(String...abc){
		Forloop5.method();
	}
}