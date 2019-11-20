// Sorting the class level values

package com.k2js.sorting.practice;
import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.deepToString;

class A2 implements Comparable<A2>{
	
	String n;
	
	A2(String n){
		this.n=n;
	}
	@Override
	public String toString(){
		return "n ="+this.n+"\t";
	
	}
	@Override
	
	public int compareTo(A2 a){
		
		//return this.n.compareTo(a.n);
		
		// own logic
		int s1=0,s2=0;
		for(char t:this.n.toCharArray())s1+=t;
		for(char t:a.n.toCharArray())s2+=t;
		return s1>s2?1:(s1<s2)? 1:0;
		
	}
	
	
}

class A2Sort{
	public static void main(String...abc){
		A2[] a2all={new A2("Hello"),new A2("Java"),new A2("Keys"),new A2("Apple")};
		Arrays.sort(a2all);
		System.out.println(deepToString(a2all));
	}
}

