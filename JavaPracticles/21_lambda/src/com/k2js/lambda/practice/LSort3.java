// writing in one statemenet

package com.k2js.lambda.practice;

import java.util.Arrays;
import static java.util.Arrays.sort;

class LSort3{
	
	public static void main(String...abc){
		StringBuffer[] sb={new StringBuffer("Cat"),new StringBuffer("Ball"),new StringBuffer("Doctor"),new StringBuffer("Apple")};
			


		Arrays.sort(sb, (x,y)-> x.toString().compareTo(y.toString()));
		System.out.println(Arrays.deepToString(sb));
	}
}