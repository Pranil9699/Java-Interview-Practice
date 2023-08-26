package com.UnicodeCharactor;

public class UniCodeInComment {
	public static void main(String[] args) {
    // HI this is my java code \u000d System.out.println("Hello");
		out(20);
		int value=20;
		// \u000d value++;
		out(value);
	}

	private static <T>void out(T i) {
		System.out.println(i);
		
	}
}
