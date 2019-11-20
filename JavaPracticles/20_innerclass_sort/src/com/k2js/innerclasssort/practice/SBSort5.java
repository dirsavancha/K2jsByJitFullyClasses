// passing annomymous class as a parameter

package com.k2js.innerclasssort.pratice;
import java.util.Arrays;
import static java.util.Arrays.sort;

class SBSort5{
	
	public static void main(String...abc){
		StringBuffer[] sb={new StringBuffer("Cat"),new StringBuffer("Ball"),new StringBuffer("Doctor"),new StringBuffer("Apple")};
		
	//new java.util.Comparator<StringBuffer>(){
		
	
//}
		Arrays.sort(sb, new java.util.Comparator<StringBuffer>(){;
		@Override
		public int compare(StringBuffer sb1,StringBuffer sb2){
		return sb1.toString().compareTo(sb2.toString());
		}
		});
		System.out.println(Arrays.deepToString(sb));
	}
}