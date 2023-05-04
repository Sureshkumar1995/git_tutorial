package com.task;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WorkoutaabbccddWithHashMap {

	public static void main(String[] args) {

		String s = "aabbccdd";
		char[] c = s.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (char d : c) {
			if (map.containsKey(d)) {
				Integer i = map.get(d);
				if (i == 1) {
					continue;
				}

			} else {
				map.put(d, 1);
			}
		}
		System.out.println(map);
		Set<Character> key = map.keySet();
		Iterator<Character> iterator = key.iterator();
		while(iterator.hasNext()) {
			Character next = iterator.next();
			System.out.print(next);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
