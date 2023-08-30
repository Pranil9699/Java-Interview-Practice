package com.NumberOperation;

public class ReverseNumberUsingRecursion {
	public static void main(String[] args) {
		/*
		 * Reverse Number Using Recursion
		 * 
		 */
		int number = 1389;
		reverseNumberUsingRecursion(number);
	}

	private static <T> void out(T reverseNumberUsingRecursion) {
		System.out.println(reverseNumberUsingRecursion);
	}

	private static void reverseNumberUsingRecursion(int number) {

		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
            reverseNumberUsingRecursion(number/10);
		}

	}

}
