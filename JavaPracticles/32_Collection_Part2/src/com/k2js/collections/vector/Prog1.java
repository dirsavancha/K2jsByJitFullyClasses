
package com.k2js.collections.vector;

import java.util.*;

class Prog1{
	public static void main(String...abc){
		Vector<Integer>v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.addElement(40);
		System.out.println(v);
		Integer[] a=new Integer[v.size()];
		v.copyInto(a);
		System.out.println(Arrays.toString(a));
		
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println(al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		al.trimToSize();
		System.out.println(al);
		
		al.ensureCapacity(20);
		System.out.println(al.size());
		System.out.println(al.hashCode());
		
		System.out.println(v.size());
		v.setSize(10);
		System.out.println(v.size());
		System.out.println("Capacity"+v.capacity());
		System.out.println(".............");
		v.add(10);
		v.add(10);
		Enumeration<Integer> eles = v.elements();
		while(eles.hasMoreElements()){
			System.out.println(eles.nextElement());
		}
		System.out.println(v.indexOf(10));
		
		System.out.println(v.lastIndexOf(10));
		
		System.out.println(v.elementAt(2));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v);
		v.setElementAt(100,0);
		System.out.println(v);
		System.out.println("..............");
		
		v.set(6, 10);
		System.out.println(v);
		System.out.println(v.removeElement(10));
		System.out.println(v);
		//v.removeAllElements();
		//System.out.println(v);
		
		 Vector<Integer> v2= (Vector<Integer>)v.clone();
		 System.out.println(v2);
		
		  System.out.println(v.get(3));
		  v.set(7, 70);
		  System.out.println(v);
		    v.add(7, 200);
		    System.out.println(v);
		    System.out.println("........");
		    
		    System.out.println(v);
		    Vector<Integer> v3 = new Vector<>();
		    v3.add(1);
		    v3.add(2);
		    v3.add(3);
		    
		    v3.addAll(v);
		    System.out.println("............");
		    System.out.println(v3);
		    
		   
		 
		   System.out.println("...........");
		    System.out.println(v.subList(2, 6));
		
		     ListIterator<Integer> li= v.listIterator();
		      while(li.hasNext())
		      {
		          System.out.println(li.next()); 	  
		      }
		      System.out.println("....");
		      while(li.hasPrevious()){
		    	  System.out.println(li.previous());
		      }
		      
		      v.forEach((i)-> System.out.println(i));
		      System.out.println("......");
		      System.out.println(v);
		      v.remove(4);v.remove(5);
		      v.remove(6);
		      System.out.println(v);
		
		
		
	}
}