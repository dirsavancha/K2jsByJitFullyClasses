// print the digits 
// eg: 34...  003,0004

package com.k2js.loops.practice;

class ForLoop6{
	public static void method(){
		int i=4786329;
		for(int a=i;a!=0;a/=10){
			int digit=a%10;
			for(int v=1;v<=digit;v++){
				if(v!=digit){
					System.out.print("0"+"\t");
				}
				else 
					System.out.println(digit);
			}
			System.out.println();
		}
	}
} 
class ForLoop6Test{
	public static void main(String...abc){
		ForLoop6.method();
		
	}
}