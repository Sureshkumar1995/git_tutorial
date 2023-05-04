package com.task;

public class PrimeOrNot {

	public static void main(String[] args) {

		int num = 57, i = 2;
		boolean prime = false;
		while (num/2>=i) {
			// condition for nonprime number
			if (num % i == 0) {
				prime = true;
				break;
			}

			i++;
		}

		if (!prime)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

	}

}
