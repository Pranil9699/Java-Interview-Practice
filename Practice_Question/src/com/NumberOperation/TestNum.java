package com.NumberOperation;

public class TestNum {
	/*
	 * Compare Two int Numbers ( Integer Caching)
	 * 
	 * the Range of it -128 to 127
	 */
	public static void main(String[] args) {

		Integer num1 = 2000;
		Integer num2 = 2000;
// they are Not equal because of Integer Caching Problem
		if (num1 == num2) {
			System.out.println("Equal");
		} else {
			System.out.println("NotEqual");
		}
	}

}
