//

package com.k2js.tostring.practice;

class Box{
	
	String colour,shape;
	
	Box(String c,String s){
		
		this.colour=c;
		this.shape=s;
		
	}
	
	@Override
	public String toString(){
		return Integer.toHexString(super.hashCode())+"#"+super.getClass().getName();
	}
}

class BoxTest{
	public static void main(String...abc){
		
		Box b1=new Box("Red","Round");
		Box b2=new Box("Blue","Square");
		
		System.out.println(b1);
		System.out.println(b2);
		
		Box b3=new Box("Green","Rectangle"){   // Ananymous class
		
		@Override
		public String toString(){
			return "Colour ="+super.colour+"\t"+"Shape ="+this.shape;
		}
			
		};
		System.out.println(b3);
	}
}