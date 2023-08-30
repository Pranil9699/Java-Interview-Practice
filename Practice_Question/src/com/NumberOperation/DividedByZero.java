package com.NumberOperation;

public class DividedByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * If You dividing the number by Zero Then What Will Be Output
		 *  for Integer to Integer (1002/0) -> Arithmetic Exception
		 *  for Floating To Integer (19.3/0) -> Infinity
		 *  for 
		 */

//		out(10/0);
		// \u000d out(10.4/0);
		out(12.34f/0);
		out(10/0.0);
		out(19.0000d/0);
		out(0.0/0.0); // this will be giving the NaN 
		out(0.0/0);
		//out(0/0);// this will be giving the error -> java.lang.ArithmeticException
		
		
	}

	private static <T>void out(Object i) {
		System.out.println(i);
		
	}

}
