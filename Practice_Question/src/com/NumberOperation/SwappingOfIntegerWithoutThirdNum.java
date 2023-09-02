package com.NumberOperation;

public class SwappingOfIntegerWithoutThirdNum {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
//		Integer a=-129;
//		Integer b=-129;
		int temp = x;
		x = y;
		y = temp;
		out(x + " : " + y);
		x = x + y;
		y = x - y;
		x = x - y;

		out(x + " : " + y);

		x = x * y;
		y = x / y;
		x = x / y;

		out(x + " : " + y);

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		out(x + " : " + y);

	}

	private static <T> void out(T object) {
		System.out.println(object);
	}
}
