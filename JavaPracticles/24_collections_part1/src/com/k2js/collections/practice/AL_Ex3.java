//

package com.k2js.collections.practice;

import java.util.*;

class AL_Ex3{
	
	public static void main(String...abc){
		Vector <String> al=new Vector<>();
		
		al.add("Apple");
		al.add("Chikoo");
		al.add("Orange");
		al.add("Bananna");
		al.add("Apple");
		System.out.println(al);
		System.out.println("-----------------");
			// for loop
			for(int i=0;i<al.size();i++){     
				System.out.println(al.get(i));
					
			}
			System.out.println("-----------------");
			
			//  Enhanced forloop
			for(String t: al){     
				System.out.println(t);
				
			}
			System.out.println("-----------------");
			// forEach loop
			al.forEach((x)-> System.out.println(x));
			
			System.out.println("-----------------");
			
			// forEach loop  2nd way
			
			al.forEach(System.out::println);
			
			System.out.println("-----------------");
			
			// using Iterator
			
			Iterator<String> itr=al.iterator();
			
			itr.forEachRemaining(x->System.out.println(x));
			System.out.println("-----------------");
			
			ListIterator<String> ite=al.listIterator();
			ite.forEachRemaining(x->System.out.println(x));
			
			System.out.println("using next-----------------");
			
			// using hasNext
			
			ListIterator<String> ite1=al.listIterator();
			for(;ite1.hasNext();){
				System.out.println(ite1.next());
				
			}
				
			
			System.out.println(" using previous-----------------");
			
			// using hasPrevious
			//ListIterator<String> ite2=al.listIterator();
			
			for(; ite1.hasPrevious();){
				System.out.println(ite1.previous());
			
			}
				System.out.println("using sort-----------------");
				// Sorting 
				
				Collections.sort(al);
				System.out.println(al);
				
				System.out.println("using sort lambda-----------------");


				Collections.sort(al,(x,y)->y.compareTo(x));
				System.out.println(al);
				
				System.out.println("using Array sort-----------------");
				// In ArrayList we have default sort method
				al.sort((x,y)->x.compareTo(y));
				System.out.println(al);
				
			
		
	}
}