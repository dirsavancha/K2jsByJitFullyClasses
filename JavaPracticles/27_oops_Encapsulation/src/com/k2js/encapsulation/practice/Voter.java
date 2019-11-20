// POJO Class
// If we make constructor as private we can't create Object for this class, we want to write sepearate method and want to create object for that

package com.k2js.encapsulation.practice;

class Voter{
	
	String name,city;
	private int age;
	
	private Voter(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	private Voter(String name,int age,String city){
		this(name,age);
		this.city=city;
		
	}
	
	public static Voter createVoter(String name,int age){
		
		return (age<18)?null:new Voter(name,age);
	
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age=(age>this.age)?age:this.age;
	}
	
	/*@Override
	
	public String toString(){
		return "Name ="+this.name+" Age = "+this.age;
	}*/
}

class VoterTest{
	
	public static void main(String...abc){
		
		
		Voter v1=Voter.createVoter("Jit",-16),v2=Voter.createVoter("Sai",19);
			  System.out.println(v1);
			  System.out.println(v2.getAge());
			  
			 v2.setAge(15); //It will not update  because it is less than voter age 
			  System.out.println(v2.getAge());
			  
			  v2.setAge(20);
			  System.out.println(v2.getAge());
			  
			  
			  
			  
	}
}