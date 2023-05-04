package com.task;

import java.util.Arrays;

public class WorkoutArrayMaxMin {

	public static void main(String[] args) {

		int a[] = { 299, 648, 763, 772, 653 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		
			System.out.println(a[1]);
			
	

		
//	Arrays.sort(a);
	
//	String string = Arrays.toString(a);
//	System.out.println(string);
	
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//		
//	}
	
	
	
	
	
	
	}

}
