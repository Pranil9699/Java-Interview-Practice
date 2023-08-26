package com.DigitOfNumber;

public class CheckIsNumaric {

	public static void main(String[] args) {

		System.out.println(isNumaric("88"));
		System.out.println(isNumaric("**"));
		System.out.println(isNumaric("p8"));
	}

	private static boolean isNumaric(CharSequence ch) {
		if(isEmpty(ch))
			return false;
		
		for (int i = 0; i < ch.length(); i++) {
			if(!Character.isDigit(ch.charAt(i)))
				return false;
		}
		return true;
	}

	private static boolean isEmpty(CharSequence ch) {
		
		return ch.isEmpty()||ch.length()==0||ch==null;
	}

}
