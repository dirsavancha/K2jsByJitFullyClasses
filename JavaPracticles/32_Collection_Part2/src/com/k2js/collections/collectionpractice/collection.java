//

package com.k2js.collections.collectionpratice;
import java.util.*;

class CollectionProgram{
	public static void main(String...abc){
		Collection<String> cl=new ArrayList<>();
		
		cl.add("Apple");
		cl.add("Bannana");
		cl.add("Apple");
		cl.add("Orange");
		cl.add("Chikko");
		System.out.println(cl);
		System.out.println(cl.size());
		System.out.println(cl.isEmpty());
		System.out.println(cl.contains("Orange"));
		
		 Object []obj=cl.toArray();
	 for(Object arr:cl){
		 System.out.println("toArray()"+arr);
	 }
	}
}