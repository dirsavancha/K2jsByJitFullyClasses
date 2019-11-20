package com.k2js.collections.listpratice;
  
import java.util.*; 
  
 class Enumerator1 { 
    public static void main(String[] argv) throws Exception 
    { 
        try { 
  
            // creating object of List<String> 
            List<String> arrlist = new ArrayList<String>(); 
  
            // Adding elemnet 
            arrlist.add("Ram"); 
            arrlist.add("Gopal"); 
            arrlist.add("Verma"); 
  
            System.out.println("List: " + arrlist); 
  
            // creating object of type Enumeration<String> 
            Enumeration<String> e = Collections.enumeration(arrlist); 
  
            // Print the Enumeration 
            System.out.println("\nEnumeration over list: "); 
  
            // print the enumeration 
            while (e.hasMoreElements()) 
                System.out.println("Value is: " + e.nextElement()); 
        } 
  
        catch (IllegalArgumentException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
  
        catch (NoSuchElementException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 