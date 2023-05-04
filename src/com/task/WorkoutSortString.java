package com.task;

import java.util.Arrays;

public class WorkoutSortString {
	public static void main(String[] args) {

		String s = "isa suresh kumar is male suresg";
		s=s.replaceAll("\\s", " ");
		System.out.println(s);
		String[] c = s.split(" ");
		System.out.println(c.length);
		String output="";
		for (int i = 0; i < c.length; i++) {
			

			for (int j = i + 1; j < c.length; j++) {
				
				if (c[i].compareTo(c[j])<0) {
					String temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}

			}
			
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
			
		}
		
		
	}
}
