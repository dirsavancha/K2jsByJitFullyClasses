//Passing class parameter and overriding the hashCode and equals method it will not allow duplicates
// sorting the elements in set by using TreeSet 

package com.k2js.collections.list_practice;

import java.util.*;

class B1 implements Comparable<B1> {
	
	String name;
	int age;
	
	B1(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString(){
		return this.name+"\t"+this.age+"\t";
	}
	
	/*@Override
	
	public int compareTo(Object o){
		  
		return((B)o).name.compare(this.name); 
	}*/
	/*public int compareTo(B b1)
	{
		String n1 =  this.name;
		String n2 = b1.name;
		return this.name.compareTo(b1.name);
	}*/ 
	/*@Override
	public int hashCode(){
		return this.name.hashCode();
	}*/
	
	/*@Override
	public boolean equals(Object o){
		return((B)o).name.equalsIgnoreCase(this.name);
	}*/
	
	@Override
	public int compareTo(B1 b){
		int nsrt=this.name.compareTo(b.name);
		return (nsrt==0)?this.age-b.age:nsrt;
	}
}

class B1Test{
	public static void main(String...abc){
		
		Set<B1> al=new TreeSet<>();
		
		al.add(new B1("ram",35));
		al.add(new B1("Jithendra",39));
		al.add(new B1("sri",25));
		al.add(new B1("Jithendra",39));
		System.out.println(al);
		
		//al.forEach((x,y)->System.out.println(x+"\t"+y));
		al.forEach((x,y)->System.out.println(x+"\t"+y));
		
	
		
		
		
		
		

		
		
	}
}