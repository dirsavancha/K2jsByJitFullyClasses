// Find the length and if length is odd print the values as it is, if length is even print values in reverse

package com.k2js.arrays.practice;

class ArrayProg6{
	
	static Number[] allvalues={10,(byte)5,(short)15,40l,50f,35d,(Byte)(byte)12,(Short)(short)22,Integer.valueOf(52)};
	
	public static void m(){
		int a=ArrayProg6.allvalues.length;
		System.out.println("Length of Number[] is" +a);
		
		if(a%2!=0)
			for(int i=0;i<1;i++){
				System.out.println(ArrayProg6.allvalues[i]);
		
			}
			else if(a%2==0){
	            for(int int i=a;i>=0;i--){
					System.out.println(ArrayProg6.allvalues[i]);
				}
			}
	}
}

class ArrayProg6Test{
	public static void main(String...abc){
		
			
	}
}