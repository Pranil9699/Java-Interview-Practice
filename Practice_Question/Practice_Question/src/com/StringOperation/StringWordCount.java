package com.StringOperation;

public class StringWordCount {
	public static void main(String[] args) {
		String string = new String("PranilLikesShradha");
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (String.valueOf(string.charAt(i)).matches("[A-Z]"))
				count++;
		}
		System.out.println(count);
		count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i)))
				count++;
		}
		System.out.println(count);
		count = 0;
		count = (int) string.chars().filter(e -> Character.isUpperCase(e)).count();
        System.out.println(count);
	}
}
