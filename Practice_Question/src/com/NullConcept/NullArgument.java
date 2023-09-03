package com.NullConcept;

public class NullArgument {

	public static void main(String[] args) {
		/*
		 * Pass null argument with method overloading with String And Object types
		 */

		test(null);
		test(new Object());
	}

	private static void test(Object object) {
		System.out.println(object + " object var");

	}

	private static void test(String object) {
		System.out.println(object + " String var");

	}

	// both StringBuilder And StringBuffer Are Not Supported for null argument 
//	private static void test(StringBuilder object) {
//		System.out.println(object + " StringBuilder var");
//
//	}
//
//	private static void test(StringBuffer object) {
//		System.out.println(object + " StringBuffer var");
//
//	}
}
