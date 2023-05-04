package com.task;

public class PrimeNumber {

	public static void main(String[] args) {
		

		for (int i = 1; i < 30; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {

				if (i % num == 0) {

					counter = counter + 1;
				}

			}
			if (counter == 2) {
				int primeNumber = i;
				System.out.print(primeNumber + " ");
			}
		}

	}

}
