// Sorting the class level values

package com.k2js.sorting.practice;
import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.deepToString;

class A1 implements Comparable<A1>{
	
	String n;
	
	A1(String n){
		this.n=n;
	}
	@Override
	public String toString(){
		return "n ="+this.n+"\t";
	}
	
	@Override
	
	public int compareTo(A1 a){
		return this.n.compareTo(a.n);
		
		// own logic
		/*int s1=0,s2=0;
		for()
		*/
	}
	
	
}

class A1Sort1{
	
	public static void main(String...abc){
		A1[] a1={new A1("Hello"),new A1("Java"),new A1("Apple")};
		Arrays.sort(a1);
		System.out.println(deepToString(a1));
	}
}