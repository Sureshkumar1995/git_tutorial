package com.task;

public class NumberReverse {
	public static void main(String[] args) {
		String str="98765432";
		int num = Integer.parseInt(str);
		int reverse =0;
		while(num>0){

		reverse=(reverse*10)+num%10;
		num=num/10;
		}
		System.out.println(reverse);
		
	}

}
