package com.task;

public class OverLoadExample {

	public String m1() {
		String s="suresh";
		return s;
	
	}

	public String m1(String i) {
		String s=i;
		return s;
		
	}
	public void m1(double d) {
		System.out.println("limar");
		
	}
	
	public static void main(String[] args) {
		
		OverLoadExample over= new OverLoadExample();
		
		System.out.println(over.m1("suresh"));
		
	}
	
	
	
	
}
