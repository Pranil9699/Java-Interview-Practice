package com.NumberOperation;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = new Scanner(System.in).nextInt();
		boolean check = false;

		if (!(number <= 1)) {
			check=isprime(number);
			
			if (check)
				System.out.println(number + " is Prime Number ");
			else
				System.out.println(number + " is Not Prime Number ");
		} else
			System.out.println("Number is Not Prime Number");
		
		getPrimeNumbers(100000);

	}

	private static void getPrimeNumbers(int i) {
		for (int j = 2; j <= i; j++) {
			if(isprime(j)) {
				System.out.print(j+", ");
			}
		}
		
	}

	private static boolean isprime(int number) {

		for (int i = 2; i < number; i++) {

			if (number % i == 0)
				return false;
		}
		return true;
	}
}
