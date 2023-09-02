package com.StringOperation;

import java.util.Arrays;

public class AnagramStringOrNot {
	/*
	 * WAP to Check Whether 2 string are Anagram String or not
	 */
	public static void main(String[] args) {

		String str1 = "Pranil".trim().toLowerCase(), str2 = "lnipra".trim().toLowerCase();
		boolean check = isAnagram(str1, str2);

		if (check)
			System.out.println("Strings Are Anagram String");
		else
			System.out.println("Strings Are Not Anagram String");

	}

	private static boolean isAnagram(String str1, String str2) {

		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);

//		return false;/
	}
}
