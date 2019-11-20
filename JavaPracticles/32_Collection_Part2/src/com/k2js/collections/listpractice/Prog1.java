//

package com.k2js.collections.listpratice;
import java.util.*;

class Prog1{
	
	public static void main(String...abc){
		ArrayList<Integer> allvalues=new ArrayList<>();
		
		allvalues.add(10);
		allvalues.add(5);
		allvalues.add(15);
		allvalues.add(16);
		allvalues.add(17);
		allvalues.add(15);
		allvalues.add(16);
		
		Iterable<Integer> itr1=allvalues;
		Iterator<Integer> it=itr1.iterator();
			for(;it.hasNext(););
				System.out.println(it.hasNext());
			
		
	}
}