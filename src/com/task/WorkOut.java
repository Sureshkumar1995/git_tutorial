package com.task;

public class WorkOut {

	public static void main(String[] args) {

		String s = "suresh kumar";
		String output = "";
		String[] split = s.split(" ");
		char k=115;
		System.out.println(k);
		
		for (String string : split) {

			for (int i = 0; i < string.length(); i++) {

				char c = string.charAt(i);
				if (i == 0 || i == string.length() - 1) {

					c = Character.toUpperCase(c);
					output = output + c;

				} else {
					output = output + c;
				}
			}
			output=output+" ";
		}
		System.out.println(output);
	}

}
