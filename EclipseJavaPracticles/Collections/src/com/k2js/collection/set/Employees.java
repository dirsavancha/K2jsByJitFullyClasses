package com.k2js.collection.set;

public class Employees  {
	
	int id;
	String name;
	float sal;
	
	public Employees(int id,String name,float sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
				
	}
	@Override
	public int hashCode() {
		return this.id;
	}@Override
	public boolean equals(Object obj) {
		return this.name.equalsIgnoreCase(((Employees)obj).name);
	}
	@Override
	public String toString() {
		return "Id is"+this.id+"\t"+"Name is"+this.name+"\t"+"sal is"+this.sal;
	}
	/*
	 * @Override public int compareTo(Employees o) { return
	 * ((Integer)this.id).hashCode()+((String)this.name).hashCode()+((Float)this.sal
	 * ).hashCode(); }
	 */
}
