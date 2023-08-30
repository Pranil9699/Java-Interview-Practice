package com.StringOperation;

import java.util.function.IntPredicate;

public class VowelCount {

	public static void main(String[] args) {

		String str = "aEIou";
		int count = 0;
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (isVowel(c))
				count++;
		}
		out("VowelCount is :" + count);

		out("***********************");

		out("**Using Java 8 Streams: ****");

		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int t) {
//				System.out.println("t=='a'"+(t=='a'));
//				out(t);
				return (t == 'a' || t == 'e' || t == 'o' || t == 'i' || t == 'u' || t == 'A' || t == 'E' || t == 'O'
						|| t == 'I' || t == 'U') ? true : false;
			}
		};
		long count2 = str.chars().filter(vowel).count();
		out("VowelCount is :" + count2);

	}

	private static <T> void out(T object) {
		System.out.println(object);
	}

	public static boolean isVowel(char t) {
		return (t == 'a' || t == 'e' || t == 'o' || t == 'i' || t == 'u' || t == 'A' || t == 'E' || t == 'O' || t == 'I'
				|| t == 'U') ? true : false;

	}
}
