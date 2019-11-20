//

package com.k2js.collections.list_practice;

import java.util.*;

class SetProg2{
	
	public static void main(String...abc){
		Set<String> s=new LinkedHashSet<>();
		
		s.add("Apple");
		s.add("Ball");
		s.add("Apple");
		s.add(new String("Ball"));
		s.add(null);
		s.add("Dog");
		s.add(null);
		s.add("Cat");
		s.add("Camel");
		System.out.println(s.size());
		System.out.println(s);
		
		System.out.println("Enhanced for loop");
		for(String t: s){
			System.out.println(t);
		}
		/*System.out.println("For loop");  // it is not index based
		for(int i=0;i<s.size();i++){     
				System.out.println(s.get(i));
					
			}*/
		 System.out.println("lambda expression for each loop");
			s.forEach((x)-> System.out.println(x));
				
			System.out.println(" forEach loop  2nd way");
			s.forEach(System.out::println);
			
			Iterator<String> itr=s.iterator();
			System.out.println(" using Iterator");
			itr.forEachRemaining(x->System.out.println(x));
			
			
			System.out.println("using list Iterator by converting");
			ListIterator<String> ite=new ArrayList<>(s).listIterator();
			ite.forEachRemaining(x->System.out.println(x));
			
			System.out.println("using has next()");
			ListIterator<String> ite1=new ArrayList<>(s).listIterator();
			for(;ite1.hasNext();){
				System.out.println(ite1.next());
				
			}
			System.out.println("Using previous");
			for(; ite1.hasPrevious();){
				System.out.println(ite1.previous());
			
			}
			
	}
}