package com.k2js.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Prog1 {
	public static void main(String[] args) {
		Map<String,Number> mp=new HashMap<>();
		
		mp.put("Even", 2);
		mp.put("Odd", 5);
		mp.put("Whole", 0);
		mp.put("Prime", 7);
		mp.put("Even", 4);
		System.out.println(mp);
		mp.forEach((k,v)->System.out.println(k+"\t"+v));
		System.out.println("Keys are"+mp.keySet());
		System.out.println("Values are"+mp.values());
		System.out.println("Contains Key"+mp.containsKey("Even"));
		System.out.println("Contains Value"+mp.containsValue(3));
		System.out.println("KeySet"+mp.keySet());
		System.out.println(mp.entrySet());
		
	}

}
