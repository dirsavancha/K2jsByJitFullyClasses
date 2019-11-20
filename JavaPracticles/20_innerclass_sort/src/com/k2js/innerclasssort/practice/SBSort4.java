// creating anonymus class instead of inner class

package com.k2js.innerclasssort.pratice;
import java.util.Arrays;
import static java.util.Arrays.sort;

class SBSort4{
	
	public static void main(String...abc){
		StringBuffer[] sb={new StringBuffer("Cat"),new StringBuffer("Ball"),new StringBuffer("Doctor"),new StringBuffer("Apple")};
		
	java.util.Comparator<StringBuffer> cp = new java.util.Comparator<StringBuffer>(){
		
	@Override
	public int compare(StringBuffer sb1,StringBuffer sb2){
		return sb1.toString().compareTo(sb2.toString());
	}
};
		Arrays.sort(sb, cp);
		System.out.println(Arrays.deepToString(sb));
	}
}