package com.NumberConversion;

public class BinaryToDecimal {

	/*
	 * Conversion of Binary NUmber ( which include whole number or decimal Number ) to Digit in Integer or Double format ?
	 */
	
	public static void main(String[] args) {
		out(BinaryToDecimalNumber(10110.0001));
		out(BinaryToDecimalNumber(11));
		out(BinaryToDecimalNumber(1011));
		out(BinaryToDecimalNumber(1011.0111));
	}

	private static <T> void out(T object) {
		System.out.println("The Decimal Digit Is :" + object);
	}

	private static Object BinaryToDecimalNumber(Object i) {
		boolean checkInt = checkInt(i);
		if (!checkInt) {
			double copyNumber = (double) i;
			String string = Double.toString(copyNumber);
			String[] split = String.valueOf(string).split("\\.");
			int stringToNumber1 = StringToNumber(split[0]);
			int stringToNumber2 = StringToNumber(split[1]);
			int decimalBeforeNumber = getDecimalBeforeNumber((int) stringToNumber1);
			Double decimalAfterNumber = getDecimalAfterNumber((int) stringToNumber2);
			return decimalBeforeNumber + decimalAfterNumber;
		} else {
			int resultNumber = 0;
			resultNumber = getDecimalBeforeNumber((int) i);
			return resultNumber;
		}

	}

	private static double getDecimalAfterNumber(int i) {
		double result = 0;

		int reverseNumber = getReverseNumber(i);
		int j = 1;
		while (reverseNumber != 0) {
			int rem = reverseNumber % 10;
			double pow = Math.pow(2, (-1 * j));
			result += rem * pow;
			rem /= 10;
			j++;
			reverseNumber /= 10;
		}
		return result;
	}

	private static int getReverseNumber(int number) {
		int newNum = 0;
		while (number != 0) {
			int rem = number % 10;
			newNum = newNum * 10 + (rem);
			number /= 10;
		}
		return newNum;
	}

	private static int getDecimalBeforeNumber(int i) {
		int result = 0;
		int copyNumber = (int) i;
		int j = 0;
		while (copyNumber != 0) {
			int rem = copyNumber % 10;
			int pow = (int) Math.pow(2, j);
			result += rem * pow;
			copyNumber /= 10;
			j++;
		}
		return result;
	}

	private static int StringToNumber(String string) {
		int intval = 0;
		for (int i = 0; i < string.length(); i++) {
			intval = intval * 10 + (string.charAt(i) - 48);
		}
		return intval;
	}

	private static boolean checkInt(Object i) {
		try {
			int a = (int) i;
			return true; // assuming this Number is Integer
		} catch (Exception e) {
			return false;// assuming this Number is Double
		}
	}
}
