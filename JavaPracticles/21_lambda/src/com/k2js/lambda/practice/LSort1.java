// creating  lambda for sorting

package com.k2js.lambda.practice;

import java.util.Arrays;
import static java.util.Arrays.sort;

class LSort1{
	
	public static void main(String...abc){
		StringBuffer[] sb={new StringBuffer("Cat"),new StringBuffer("Ball"),new StringBuffer("Doctor"),new StringBuffer("Apple")};
			
		Arrays.sort(sb, (StringBuffer sb1,StringBuffer sb2)->{
		return sb1.toString().compareTo(sb2.toString());
	});
		System.out.println(Arrays.deepToString(sb));
	}

}