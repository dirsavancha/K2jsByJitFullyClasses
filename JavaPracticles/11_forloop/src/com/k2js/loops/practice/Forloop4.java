// add the even and odd digits

package com.k2js.loops.practice;

class Forloop4{
	public static void method(){
	int i=4786329;
	int digit=0;
	int sum=0;
	
		for(int a=i;a!=0;a/=10 ){
			digit=a%10;
			if(i%2==0 && digit%2==1){
				sum+=digit;
			}
			else if(i%2==1 && digit%2==0){
				sum+=digit;
			}
			
		}
		System.out.println(sum);
	}
}

class Forloop4Test{
	public static void main(String...abc){
		Forloop4.method();
	}
}