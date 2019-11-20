// Print the sum of Only Asci Char Values is prime number

package com.k2js.strings.practice;

class PrintSumOfOnlyAsciCharOnlyPrime{
	public static void printSumOfAsciOnlyIfPrimr(String s){
		int sum=0;
		for(char c:s.toCharArray()){
			
			int pc=0;
			for(int i=1;i<=c/2;i++){
				if(c%i==0){
					pc++;
					
				}
				if(pc==1){
					sum+=c;
				}
				System.out.println(sum);
				
			}
		}
	}
}
class PrintSumOfOnlyAsciCharOnlyPrimeTest{
	public static void main(String...abc){
		PrintSumOfOnlyAsciCharOnlyPrime.printSumOfAsciOnlyIfPrimr("keys2javaselenium");
	}
}