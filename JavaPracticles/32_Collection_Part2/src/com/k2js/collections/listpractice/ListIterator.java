
package com.k2js.collections.listpratice;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
class ListIteratorExample {
  public static void main(String a[]){
    ListIterator<String> litr = null;
    List<String> names = new ArrayList<String>();
    names.add("Ram");
    names.add("Sai");
    names.add("Hari");
    names.add("Suresh");
    names.add("Kamal");
	
	names.remove("Kamal");
    
    litr=names.listIterator();
 
    System.out.println("forward direction:");
    while(litr.hasNext()){
       System.out.println(litr.next());
    }
    System.out.println(" backward direction:");
    while(litr.hasPrevious()){
       System.out.println(litr.previous());
    }
	
  }
}