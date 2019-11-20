//  Find the sum of the digits if the digit is even

package com.k2js.loops.practice;

class Forloop3{
	public static void method(){
		int i=4786329;
	    int sum=0;
		
		if(i%2==0){
			for(int a=i;a!=0;a/=10){
				int digit=a%10;
					if(digit%2==1){
						sum +=digit;
					}		
			}
			
		}
		else {
			for(int a=i;a!=0;a/=10){
				int digit =a%10;
				if(digit%2==0){
					sum +=digit;
				}
			}
		}
		System.out.println(sum);
	}
}

class Forloo3Test{
	public static void main(String...abc){
		Forloop3.method();
		
	}
}