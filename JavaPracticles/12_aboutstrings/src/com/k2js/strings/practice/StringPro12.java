// Generate five character find the biggest among those

package com.k2js.strings.practice;

class StringPro12{
	public static char getFindBigestChar(String s){
		char bigchar=0;
		for(int i=0;i<5;i++){
			char rc=s.charAt((int)(Math.random()*s.length()+0));
			System.out.println("Random number is "+rc);
			bigchar=bigchar<rc?rc:bigchar;
		}
		return bigchar;
	}
}

class StringPro12Test{
	public static void main(String...abc){
		char c=StringPro12.getFindBigestChar("keys2javaselenium");
		System.out.println("Biggest char in random generateChar is "+c);
	}
}