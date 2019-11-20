

package com.k2js.collections.listpratice;
import java.util.*;

class ArrayList1{
	public static void main(String...abc){
	ArrayList<String> alist=new ArrayList<>();  
      alist.add("Hari");
      alist.add("Ram");
      alist.add("Sai");
	  alist.add("Ram");
	  
    
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "Steve");
  
      //displaying elements
      System.out.println(alist);
	  
	  // remove elements
	  alist.remove("Sai");
	  System.out.println(alist);
	  
	  System.out.println(alist.size());
	  System.out.println(alist.isEmpty());
	  System.out.println(alist.contains("Ram"));
	  System.out.println(alist);
	  
	  ArrayList<String>alist2=new ArrayList<>();
	  alist2.add("Sri");
	  
	  alist2.addAll(alist);
	  System.out.println(alist2);
	  System.out.println("Index is"+alist.indexOf("Ram"));
	  //System.out.println("is removed r not"+alist.remove("Sai"));
	  System.out.println("last indeof is"+alist.lastIndexOf("Ram"));
	  System.out.println("Shallow copy"+alist.clone());
	  // toArray()
	 Object []obj=alist.toArray();
	 for(Object arr:obj){
		 System.out.println("toArray()"+arr);
	 }
	 //set()
	 alist.set(1,"Shyam");
	 System.out.println("set"+alist);
	 // get()
	 System.out.println(alist.get(2));
	  
	  
	}
}