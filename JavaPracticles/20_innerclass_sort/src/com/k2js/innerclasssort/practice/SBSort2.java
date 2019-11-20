// with out using static class

package com.k2js.innerclasssort.pratice;
import java.util.Arrays;
import static java.util.Arrays.sort;

class SBSort2{
	
	 class SBCustomSort implements java.util.Comparator<StringBuffer>{
	@Override
	public int compare(StringBuffer sb1,StringBuffer sb2){
		return sb1.toString().compareTo(sb2.toString());
	}
}
	
	public static void main(String...abc){
		StringBuffer[] sb={new StringBuffer("Cat"),new StringBuffer("Ball"),new StringBuffer("Doctor"),new StringBuffer("Apple")};
		Arrays.sort(sb,new SBSort2().new SBCustomSort());
		System.out.println(Arrays.deepToString(sb));
	}
}