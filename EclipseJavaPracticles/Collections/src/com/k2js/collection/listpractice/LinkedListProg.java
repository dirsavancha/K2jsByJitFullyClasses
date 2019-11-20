package com.k2js.collection.listpractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListProg {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>(); 
		ll.add(10);
		ll.add(1, 20);
		ll.addFirst(30);
		ll.addLast(40);
		ll.add(50);
		ll.addLast(40);
		ll.add(50);
		System.out.println(ll.contains(30));
		System.out.println(ll.size());
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		ll.remove((Object) 20);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.removeFirstOccurrence((Object) 50);
		System.out.println(ll);
		ll.removeLastOccurrence((Object) 40);
		System.out.println(ll);
		ll.removeIf(x -> x < 30);
		System.out.println(ll);
		System.out.println("....");
		List<Integer> l = new LinkedList<>();
		l.add(44);
		l.add(22);
		l.add(33);
		System.out.println(l);
		ll.addAll(l);
		System.out.println(ll);
		ll.removeAll(l);
		System.out.println(ll);
		ll.addAll(0, l);
		System.out.println(ll);
		System.out.println("...");

		ll.pop();
		ll.push(21);
		System.out.println(ll);
		Iterator<Integer> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println();
		Iterator<Integer> itr2 = ll.descendingIterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next());
		}
		System.out.println("polling");
		ll.poll();
		System.out.println(ll);
		ll.pollFirst();
		System.out.println(ll);
		ll.pollLast();
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println("element");
		System.out.println(ll.element());
		System.out.println(ll.get(2));
		System.out.println(ll.set(2, 102));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		Set s = new HashSet<>();
		LinkedList<Integer> llist = new LinkedList<>(s);
		llist.add(10);
		System.out.println(ll.indexOf(40));
		System.out.println(ll.lastIndexOf(40));
		ll.offer(55);
		ll.offerFirst(33);
		ll.offerLast(77);
		System.out.println(ll);
		LinkedList<Integer> list = (LinkedList<Integer>) ll.clone();
		System.out.println(list);
		Object[] arr = list.toArray();
		for (Object o : arr) {
			System.out.println(o);
		}
		System.out.println("toarray");
		Integer[] arr1 = list.toArray(new Integer[0]);
		for (Integer o : arr1) {
			System.out.println(o);
		}
		ll.clear();
	}

}
