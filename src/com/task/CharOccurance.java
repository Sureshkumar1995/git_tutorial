package com.task;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {
	public static void main(String[] args) {

		String s = "suresh Kumar";
		s=s.replaceAll(" ", "");

		Map<Character, Integer> map = new HashMap();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
System.out.print(map);
	}
}
