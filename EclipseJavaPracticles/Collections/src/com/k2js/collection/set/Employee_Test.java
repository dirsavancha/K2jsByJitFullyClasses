package com.k2js.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee_Test {
	
	public static void main(String[] args) {
		
		Set<Employees> em=new HashSet<Employees>();
		
		
		em.add(new Employees(105,"Ram", 5000.0f));
		em.add(new Employees(102,"Sai", 7000.10f));
		em.add(new Employees(101,"Krishna", 8000.00f));
		em.add(new Employees(102,"Sai", 7000.10f));
		em.add(new Employees(107,"John", 10000.0f));
		System.out.println(em);
		
		Set<Employees> em1=new TreeSet<>((x,y)->x.id-y.id);
		em1.addAll(em);
		System.out.println("TreeSet"+em1);
		
		
	}

}
