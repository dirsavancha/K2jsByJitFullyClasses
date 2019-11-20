// Creating Mutable class

package com.k2js.encapsulation.practice;

 class MutableStudentClass{      

	 int id;                       
	 String name;
	
	public MutableStudentClass(String name,int id){ 
		this.name=name;
		this.id=id;
		
	}
	
	@Override
	
	public String toString(){
		return "Name is ="+this.name+"\t"+"Id is ="+this.id;
	}
	public String getName(){    
		return name;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public void setId(int id){
		this.id=id;
	}
}

class MutableStudentClassTest{
	
	public static void main(String...abc){
		MutableStudentClass im=new MutableStudentClass("Ram",100);
		System.out.println(im.getName());
		System.out.println(im.getId());
		
		im.name="Sri";
		im.id=150;
		System.out.println("After Modified");
		System.out.println(im.getName());
		System.out.println(im.getId());
		
		
	}
}