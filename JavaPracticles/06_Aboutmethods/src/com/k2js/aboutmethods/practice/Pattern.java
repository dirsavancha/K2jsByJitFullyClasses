// Pattern

package com.k2js.aboutmethods.practice;



class Methods{
	 
	public static void m(){
		System.out.print("*");
	}
	public static void m(Object o){
		System.out.print(o);
	}
	public static char n(){
		return '\n';
	}
	public static int m(int i,int j){
		return i+j;	
	}
}


	

public class Pattern{
	public static void main(String...abc){
		
		// calling m methods to print *
		Methods.m();
		Methods.m();
		Methods.m();
		Methods.m();
		Methods.m();
		Methods.m();
		//calling n method to keep cursor in to next line
		char ch=Methods.n();
            Methods.m(ch);
			Methods.m();
			Methods.m();
		int sum=Methods.m(10,20);
		    Methods.m(sum);
		    Methods.m();
		    Methods.m();
		
		    Methods.m(ch);
		    Methods.m();
		    Methods.m();
		    Methods.m();
		    Methods.m();
		    Methods.m();
		    Methods.m();
      
           	  
	}
}	
	
