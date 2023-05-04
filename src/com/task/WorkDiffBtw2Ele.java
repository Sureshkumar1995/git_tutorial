package com.task;

import java.util.Arrays;

public class WorkDiffBtw2Ele {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 19, 3, 5, 18, 25, 30, 47, 33 };
		int n = arr.length;
		int diff = Integer.MAX_VALUE;
		System.out.println(diff);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs((arr[i] - arr[j])) < diff) {
					diff = Math.abs((arr[i] - arr[j]));
				}

			}

		}

		System.out.println("minimum difference value is: " + diff);

		Arrays.sort(arr);
		int diff1 = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i + 1] - arr[i] < diff1) {
				diff1 = arr[i + 1] - arr[i];

				if (diff1 == 1) {
					System.out.println("numbers are " + arr[i + 1] + "," + arr[i]);
					break;
				}
			}
		}
		System.out.println("minimum difference value is: " + diff1);

	}

}
