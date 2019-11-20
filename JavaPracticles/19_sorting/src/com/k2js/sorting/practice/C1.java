// Sorting values of StringBuffer

package com.k2js.sorting.practice;
import java.util.Arrays;
import static java.util.Arrays.sort;
import static java.util.Arrays.deepToString;

class C1{
	
	public static void main(String...abc){
		StringBuffer[] sbs={new StringBuffer("Java"),new StringBuffer("Keys"),new StringBuffer("Hello"),new StringBuffer("Selenium")};
		
		Arrays.sort(sbs);
		System.out.println(deepToString(sbs));
	}
}


// o/p

// Compile
//D:\SeleniumTrainingByJitendra\Practicles\JavaPracticles\19_sorting\src>..\..\..\..\Tools\Java\jdk-12\bin\javac -d ..\bin com\k2js\sorting\practice\C1.java

//Execution
//D:\SeleniumTrainingByJitendra\Practicles\JavaPracticles\19_sorting\src>..\..\..\..\Tools\Java\jdk-12\bin\java -cp ..\bin com.k2js.sorting.practice.C1
// O/P:[Hello, Java, Keys, Selenium]