// Adding Two variables

package com.k2js.aboutmethods.practice;

class Methods3{
	public static int sumOf2Num(){
		int i=10;
		Object o=20;
		int sum=i+(Integer)o;
		return sum;
		
    }
}
class Methods3Test{
	public static void main(String...abc){
		int result = Methods3.sumOf2Num();
		System.out.println(result);
	}
}
