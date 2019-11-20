// Box class legnth and width is mandatory and height is not mandatory

package com.k2js.hashcode.practice;

class Box{
	int length ,width,height;
	
	Box(int length,int width){
		this.length=length;
		this.width=width;
		
	}
	
	Box(int length,int width,int height){
		this(length,width);
		this.height=height;
	}
	
	@Override
	public String toString(){
		String length="length ="+this.length+"\t";
		String width="width ="+this.width+"\t";
		String height="height ="+this.height+"\t";
		return "Box Details :"+length+width+height;
	}
	
	@Override
	public int hashCode(){
		return this.length+this.width;
	}
	
	@Override
	public boolean equals(Object o){
		if(!(o instanceof Box ))return false;
		//boolean b3=o instanceof Box;
		//if(!b3)return b3;
		Box b=(Box)o;
		return b.length==this.length && b.width==this.width;
		//return this.length.equals(b.length);
	}
	
}

class BoxTest{
	public static void main(String...abc){
		Box b1=new Box(10,20);
		Box b2=new Box(2,28);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
	}
}