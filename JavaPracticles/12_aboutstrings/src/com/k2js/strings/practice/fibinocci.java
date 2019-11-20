// Fibinocci series

package com.k2js.strings.practice;

class Fibinocci{
	public static void fibnociSeries(){
		int i=1;
		int j=2;
		System.out.print(i+"\t");
		for(int a=0;a<10;a+=2){
			System.out.print(j+"\t");
			int temp=i;
			i=j;
			j=j+temp;
			
		}
	}
}

class FibinocciTest{
	public static void main(String...abc){
		Fibinocci.fibnociSeries();
	}
}