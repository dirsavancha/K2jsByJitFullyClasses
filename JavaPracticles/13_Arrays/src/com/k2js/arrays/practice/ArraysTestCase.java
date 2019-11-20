// find and store the values if values is "y" then print "welcome" "keys",if "n" print blank

package com.k2js.arrays.practice;
import java.util.Arrays;


class ArraysTestCase{
	
	static String[] td=new String[]{"TC_001","verifyHomePage","y","Welcome","Keys"};
	 public static String[] method(String tcn,String tcrs){  // test case name(tcn),test case run status(tcrs)
	 
		java.util.List<String> a=new java.util.ArrayList<>();
		if(td[1].equals(tcn)&&tcrs.equals("y")){
			for(int i=3;i<td.length;i++){
				a.add(td[i]);	
			}
			
		}
		return a.toArray(new String[0]);
		
	}
} 

class ArraysTestCaseTest{
	public static void main(String...abc){
		System.out.println((java.util.Arrays.toString(ArraysTestCase.method("verifyHomePage","y"))));
	}
}