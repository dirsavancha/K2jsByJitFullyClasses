//

package com.k2js.hashcode.practice;

class Bird{
	
	String name,colour;
	
	 Bird(String name,String colour){
		
		this.name=name;
		
	}
	
	@Override
	public String toString(){
		return "name ="+this.name+"\t"+"colour ="+this.colour;
	}
	
	@Override
	public int hashCode(){
		return this.name.hashCode();
		// or
		// return java.util.Objects.hashCode(this.name);
		// or (own logic)
		/*int sum=0;
		for(char c:this.name.toCharArray)sum+=c;
		return sum;*/
		
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Bird)return false;
		Bird b=(Bird)o;
		return this.name.equals(b.name);
	}
}

class BirdTest{
	public static void main(String...abc){
		Bird b1=new Bird("Parrot","Green");
		Bird b2=new Bird("Parrot","Green");
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		Bird b3=new Bird("rrot","Green");
		System.out.println(b3.hashCode());
		System.out.println(b2.equals(b3));
	}
}