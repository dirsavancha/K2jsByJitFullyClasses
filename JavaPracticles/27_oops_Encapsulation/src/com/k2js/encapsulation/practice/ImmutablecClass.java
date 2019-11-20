//Creating Immutable Class

package com.k2js.encapsulation.practice;

final class ImmutableStudentClass{       //The class must be declared as final (So that child classes can’t be created)

	final int id;                        //Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
	final String name;
	
	public ImmutableStudentClass(String name,int id){  // A parameterized constructor
		this.name=name;
		this.id=id;
		
	}
	public String getName(){   //Getter method for all the variables 
		return name;
	}
	public int getId(){
		return id;
	}
}

class ImmutableStudentClassTest{
	
	public static void main(String...abc){
		ImmutableStudentClass im=new ImmutableStudentClass("Ram",100);
		System.out.println(im.getName());
		System.out.println(im.getId());
		
		im.name="Sri";  /  error: cannot assign a value to final variable name
	}
}