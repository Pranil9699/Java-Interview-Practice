package com.StringOperation;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Selenium";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev += str.charAt(i);

		}
		System.out.println(rev);

		System.out.println("By Using The StringBuffer");
		StringBuffer stringBuffer = new StringBuffer(str);
		System.out.println(stringBuffer.reverse());
	}

}
