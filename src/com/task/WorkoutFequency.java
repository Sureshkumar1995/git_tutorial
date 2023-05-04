package com.task;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WorkoutFequency {

	public static void main(String[] args) {

		String s = "Selenium java";
		s = s.toLowerCase().replaceAll(" ", "");
		char[] arr = s.toCharArray();
		int[] f = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					f[j] = -1;
				}

			}
			if (f[i] != -1) {
				System.out.print(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (f[i] > 0) {
				System.out.println(arr[i]+" = "+f[i]);
			}
		}
System.out.println();
		char[] charArray = s.toCharArray();
		Set<Character> s1 = new LinkedHashSet<>();
		for (int i = 0; i < charArray.length; i++) {
			s1.add(charArray[i]);
		}
		for (Character character : s1) {
			System.out.print(character);

		}
	}

}
