//

package com.k2js.collections.map_practice;

import java.util.*;

class MapProg1{
	public static void main(String...abc){
		
		Map<String,Integer> fruits=new HashMap<>();
		
		fruits.put("Bannnan",98);
		fruits.put("Apple",98);
		fruits.put("Bannnan",65);
		fruits.put("Guva",60);
		fruits.put("Chikko",80);
		System.out.println(fruits);
		
		fruits.forEach((x,y)->System.out.println(x+"\t"+y));
		
	}
}
