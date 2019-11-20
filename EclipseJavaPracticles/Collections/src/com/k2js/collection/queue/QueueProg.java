package com.k2js.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProg {
	public static void main(String[] args) {
		Queue<Integer>al=new PriorityQueue<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(8);
		System.out.println(al);
		/*System.out.println(al.element());
		System.out.println(al.offer(5));
		
		System.out.println(al.remove(5));
		System.out.println(al);*/
		System.out.println(al.peek());
		System.out.println(al.poll());
		System.out.println(al);
	}

}
