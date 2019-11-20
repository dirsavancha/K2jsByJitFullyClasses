//By using constructor colour is not mandatory,height width,length is mandatory

package com.k2js.constructors.practice;

class Wall{
	
	String colour;
	int height,width,length;
	
	Wall(int height,int width,int length){
		
		this.height=height;
		this.width=width;
		this.length=length;
	}
	
	Wall(int height,int width,int length,String colour){
		this(height,width,length);
		this.colour=colour;
		
	}
	/*@Override
	public String toString(){
	    String height="height :"+ this.height +"\t";
		String width="width :"+this.width +"\t";
		String length="length :"+this.length +"\t";
		String colour="colour :"+this.colour +"\t";
		
		return "wall Details "+height+width+length+colour;
		
	}*/
	
}

class WallTest{
	public static void main(String...abc){
		Wall obj=new Wall(100,20,50,"White");
		System.out.println(obj);
		Wall obj2=new Wall(2000,1000,5000,"Black");
		System.out.println(obj2);
	}
}