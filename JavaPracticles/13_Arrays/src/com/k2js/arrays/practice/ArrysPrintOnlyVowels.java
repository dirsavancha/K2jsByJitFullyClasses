//Printing Vowels If more than 3

package com.k2js.aboutarrays.practice;

class ArraysPrintOnlyVowels{
	
	public static void vowels(String[] a){
		
		for(String s:a){
			int vcount=0;
			
			for(int i=0;i<s.length();++i){
				Character CharCharacter=s.charAt(i);
				char[] vowels={'a','e','i','o','u'};
				
				if(java.util.Arrays.binarySearch(vowels,CharCharacter) >= 0){
					vcount += 1;
				}
			}
			if(vcount>=2)
				System.out.println(s);
		}
	}
}

class ArraysPrintOnlyVowelsTest{
	
	public static void main(String...abc){
		ArraysPrintOnlyVowels.vowels(new String[]{"Hello","Bangalore","Karthik","xyz"});
	}
}
