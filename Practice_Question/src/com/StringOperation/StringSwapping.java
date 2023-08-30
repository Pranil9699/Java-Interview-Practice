package com.StringOperation;

public class StringSwapping {

	public static void main(String[] args) {
		String str1 = "Pranil", str2 = "Takawane";

		out("Before Swapping the String Are :");
		out(" str1 :" + str1);
		out(" str2 :" + str2);

		// Merging Strings into first string
		str1 = str1 + str2;

		// get the first variable string into second variable
		str2 = str1.substring(0, str1.length() - str2.length());

		// get the first variable string into second variable
		str1 = str1.substring(str2.length());

		out("After Swapping the String Are :");
		out(" str1 :" + str1);
		out(" str2 :" + str2);
	}

	private static <T> void out(T stream) {
		System.out.println(stream);
	}
}
