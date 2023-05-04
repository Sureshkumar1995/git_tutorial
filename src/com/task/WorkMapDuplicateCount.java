package com.task;

import java.util.HashMap;
import java.util.Map;

public class WorkMapDuplicateCount {

	public static void main(String[] args) {
		
		String s= "suresh kumar";
		
		s=s.replaceAll(" ", "");
		int count=0;
		Map<String,Integer> map = new HashMap<>();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			String string = Character.toString(c[i]);
			
			if(map.containsKey(string)) {
				count++;
			break;
			}else {
				map.put(string, 1);
			}
			
		}
		System.out.println(map);
		System.out.println(count);
	}
	
	
	
	
}
