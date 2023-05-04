package com.task;

public class StringCharCount {
public static void main(String[] args) {
	
	String s = "suresh Kumar65475";
	int count=0;
	boolean digit=true;
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' '|| digit == Character.isDigit(s.charAt(i))) {
			count++;
		}
	}
	System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
