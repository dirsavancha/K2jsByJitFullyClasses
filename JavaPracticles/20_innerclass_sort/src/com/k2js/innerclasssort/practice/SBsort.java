// sorting without using using Comparable Method

package com.k2js.innerclasssort.pratice;
import java.util.Arrays;
import static java.util.Arrays.sort;

/*
package com.k2js.innerclasssort.pratice;
import java.util.Arrays;
import static java.util.Arrays.sort;

class SBsort{

	
	public static void main(String...abc){
		StringBuffer[] sb={new StringBuffer("Cat"),new StringBuffer("Ball"),new StringBuffer("Doctor"),new StringBuffer("Apple")};
		Arrays.sort(sb,new SBCustomSort());
		System.out.println(Arrays.deepToString(sb));
	}
}

	
class SBCustomSort implements java.util.Comparator<StringBuffer>{
	
	@Override
	public int compare(StringBuffer sb1,StringBuffer sb2){
		return sb1.toString().compareTo(sb2.toString());
	}
}
*/

//  Writing customize sorting by writing static to the class

class SBsort{
	
	static class SBCustomSort implements java.util.Comparator<StringBuffer>{
	@Override
	public int compare(StringBuffer sb1,StringBuffer sb2){
		return sb1.toString().compareTo(sb2.toString());
	}
}
	
	public static void main(String...abc){
		StringBuffer[] sb={new StringBuffer("Cat"),new StringBuffer("Ball"),new StringBuffer("Doctor"),new StringBuffer("Apple")};
		Arrays.sort(sb,new SBsort.SBCustomSort());
		System.out.println(Arrays.deepToString(sb));
	}
}





//  without comparator the error is

/*D:\SeleniumTrainingByJitendra\Practicles\JavaPracticles\20_innerclass_sort\src>java -cp ..\bin com.k2js.innerclasssort.pratice.SBsort
Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
        at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
        at java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
        at java.util.Arrays.sort(Arrays.java:1246)
        at com.k2js.innerclasssort.pratice.SBsort.main(SBsort.java:11)*/
