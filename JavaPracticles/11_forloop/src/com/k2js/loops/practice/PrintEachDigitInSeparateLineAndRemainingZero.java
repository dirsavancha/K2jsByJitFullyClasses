// print Each given digit in sepearate line and remaing are Zeros
// eg:  156723
//156723
//15672
//1567
//156
//15
//1

package com.k2js.loops.practice;

class PrintEachDigitInNewLine{
	public static void digitPrint(int num){
		for(int i=num;i!=0;i/=10){
				System.out.println(i);
		}	
	}
}
class PrintEachDigitInNewLineTest{
	public static void main(String...abc){
		PrintEachDigitInNewLine.digitPrint(156723);
	}
}