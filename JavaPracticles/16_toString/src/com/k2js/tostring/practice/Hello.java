//

package com.k2js.tostring.practice;

class Hello{
	
		public static void main(String...abc){
			String s1=new String("Hello");
			String s2=new String("Hello");
			System.out.println("Value is"+s1==s2); // Comparing Adress
			
			System.out.println(s1.equals(s2));
			
			System.out.println(s1.intern()==s2.intern());
			
		
	}
}
