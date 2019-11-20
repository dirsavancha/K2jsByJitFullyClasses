// Creating the book Class with total five equals methods()

package com.k2js.equals.practice;

class Book{
	
	String name;
	int no_of_pages;
	
	Book(String name,int nop){
			
			this.name=name;
			this.no_of_pages=nop;
	}
	
/*	  // It will work internally                       // 1 Method
class Object{
	public boolean equals(Object o){
		return this==0;
	}
		
	}*/
	
	public String toString(){
		
		return this.name+"\t"+this.no_of_pages;
	}
	public boolean equals(Book b){
		System.out.println("equals-2 ");
		return this.name.equals(b.name);
	}
	
	@Override
	public boolean equals(Object o){
		System.out.println("equals-3 ");
		boolean b1=o instanceof Book;
		if(!b1)return b1;
		Book b=(Book)o;
		boolean b2=b.name.equalsIgnoreCase(this.name);
		return b2;
	}
	
}

class BookTest{
	
	public static void main(String...abc){
		
		Book b1=new Book("Java",100);
		Book b2=new Book("java",200);
		
		Object b3=new Book("Core Java Book",150){
		
			@Override
			public boolean equals(Book b){
				System.out.println("equals-4 ");
			return b.name.endsWith(super.name);
			}
			
			@Override
			public boolean equals(Object o){
				System.out.println("equals-5 ");
				boolean b1=o instanceof Book;
				if(!b1)return b1;
				Book b2=(Book)o;
				return this.name.contains(b2.name);
			
			}
		};
		System.out.println(b1.equals(b2));  // 2nd should executed result is false
		System.out.println(b2.equals(b1));  // 2nd should executed result is false
		System.out.println(b1.equals(b3));  // 3rd should executed result is false
		System.out.println(((Object)b1).equals(b2));// pointing to 1 st method but executing 3rd method  --Runtime Polymorphism
		System.out.println(b3.equals(b1));  // pointing to 1 st method but executing 5th method   --Runtime Polymorphism
		System.out.println(b3.equals((Object)b1));  // pointing to 1 st method but executing 5th method  --Runtime Polymorphism
		
		
	}
}

/*
Output
equals-2
false
equals-2
false
equals-3
false
equals-3
true
equals-5
true
equals-5
true

*/