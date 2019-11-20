

package com.k2js.collections.Deque;

import java.util.*;


public class Prog1 {
 public static void main(String[] args) {
	Deque<String> li=  new LinkedList<>();
	li.add("aa");
	li.add("nn");
	li.add("rr");
	li.add("ee");
	
	System.out.println(li);
	
	li.addFirst("pp");
	li.addLast("uu");
	System.out.println(li);
	li.offerFirst("qq");
	System.out.println(li);
	li.offerLast("mm");
	System.out.println(li);
	li.removeFirst();
	li.removeLast();
	System.out.println(li);
	
	li.pollFirst();
	li.pollLast();
	System.out.println(li);
	
	System.out.println(li.getFirst());
	System.out.println(li.getLast());
	
	System.out.println(li.peekFirst());
	System.out.println(li.peekLast());
	
	li.add("aa");
	li.add("rr");
	System.out.println(li);
	
	li.removeFirstOccurrence("aa");
	System.out.println(li);
	li.removeLastOccurrence("rr");
	System.out.println(li);
	
	li.offer("tt");
	System.out.println(li);
	
	li.remove();
	System.out.println(li);
	
	li.poll();
	System.out.println(li);
	
	System.out.println(li.element());
	System.out.println(li.peek());
	
	li.push("ww");
	System.out.println(li);
	
	li.pop();
	System.out.println(li);
	
	System.out.println("--------------");
	Iterator<String> items= li.descendingIterator();
	while(items.hasNext())
	{
		System.out.println(items.next());
	}
}
}