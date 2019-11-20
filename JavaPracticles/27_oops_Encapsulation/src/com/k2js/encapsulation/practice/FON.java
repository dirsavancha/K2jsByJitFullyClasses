// SingleTon Example with a static block

package com.k2js.encapsulation.practice;

class FON{  // Father Of Nation
	
	static private FON fn=null;
	
	private FON(){
		
	}
	static{
		fn=new FON();
	}
	public static FON getFon(){
		// if(fn==null) fn=new Fon();
		return FON.fn;
	}
	
	@Override
	
	public String toString(){
		return "Gandhi";
	}
}

class FONTest{
	
	public static void main(String...abc){
		FON fn1=FON.getFon();
		FON fn2=FON.getFon();
		System.out.println(fn1);
		System.out.println(fn2);
		
		System.out.println(fn1==fn2);
	}
}