package com.NumberOperation;

public class DoubleMinValue {

	public static void main(String[] args) {

		/*
		 * What is the value of double MIN_VALUE? -> It is Actually The Positive Value
		 * which one is bigger -> Double MIN_VALUE or 0.0d? -> MIN_VALUE is Bigger value
		 * which one is bigger > Double MIN_VALUE or NAGATIVE_INFINITY ? -> MIN_VALUE is
		 * bigger value
		 */
		out(Double.MIN_VALUE);
		out(Long.MIN_VALUE);
		out(Integer.MIN_VALUE);
		out(Float.MIN_VALUE);
		out(Math.min(Double.MIN_VALUE, 0.0d));
		out(Math.min(Integer.MIN_VALUE, 0));
		out(Math.min(Float.MIN_VALUE, 0.0f));
		out(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		
		
	}

	private static <T> void out(T minValue) {
		System.out.println(minValue);
	}
}
