package com.DigitOfNumber;

public class ArmStrongNumber {

	public static void main(String[] args) {

		out(checkNumber(153));
		out(checkNumber(1));
		out(checkNumber(9));
		out(checkNumber(2));
		out(checkNumber(5));
		out(checkNumber(0));
		out(checkNumber(9474));
		out(checkNumber(54748));
		out(checkNumber(-1));
	}

	private static Object checkNumber(int i) {
		if (i < 0)
			return i + " is Not ArmStrong Number ";
		if (i >= 0 && i <= 9)
			return i + " is ArmStrong Number ";
		int copyNumber = i;
		int length = String.valueOf(copyNumber).length();
		int sum = 0;
		sum = getSum(sum, i, length);
		
		return copyNumber == sum ? copyNumber + " is ArmStrong Number " : copyNumber + " is Not ArmStrong Number ";
	}

	private static Integer getSum(int sum, int i, int length) {
		while (i > 0) {
			var rem = i % 10;
//			int PowerOfIt = 1;
//			for (int j = 0; j < length; j++) {
//				PowerOfIt *= rem;
//			}
//			sum += PowerOfIt;
			sum+=(int) Math.pow(rem, length);
			i /= 10;
		}
		return sum;

	}

	private static <T> void out(T object) {
		System.out.println(object);
	}

}
