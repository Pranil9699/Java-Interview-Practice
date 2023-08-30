package com.NumberOperation;

public class StringToInteger {

	/*
	 * WAP to convert String to Inter Without using Interger.parseInt() method ? WAP
	 * to reverse the Integer ?
	 */

	public static void main(String[] args) {

		out(StringToNumber("90"));
		out(reverseNumber(189));
		out(convertToInt("234868539"));

	}

	private static <T> void out(T object) {

		System.out.println("*Class - " + object.getClass());
		System.out.println("*Value - " + object);
	}

	private static long StringToNumber(String str) {

		int length = str.length();
		long number = 0;
		for (int i = 0; i < length; i++) {
			// formula:
			number = number * 10 + (str.charAt(i) - 48);
		}
		return number;
	}

	private static int reverseNumber(int number) {
		int newNum = 0;
		while (number != 0) {
			int rem = number % 10;
			newNum = newNum * 10 + (rem);
			number /= 10;
		}
		return newNum;
	}

	public static int convertToInt(String str) {
		char[] charArray = str.toCharArray();
		int number =0;
		int zeroCharInt=(int)'0';
		for (int i = 0; i < charArray.length; i++) {
			number=number*10+(charArray[i]-zeroCharInt);
		}
		return number;
	}
}
