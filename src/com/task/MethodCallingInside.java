package com.task;

public class MethodCallingInside {
	private static void m1(String s, int i) {
		if (i == s.length()) {
			return;
		} else {
			
			System.out.println(s.charAt(i));
			m1(s, i + 1);
		}
	}

	public static void main(String[] args) {

		String s = "suresh Kumar";
		m1(s, 0);

	}
}
