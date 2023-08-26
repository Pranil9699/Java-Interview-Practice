package com.StringOperation;

public class FindSubString {

	/*
	 * Check Substring is present In a Given String or Not 
	 */
	public static void main(String[] args) {
		
		out(isSubString("Pranil Takawane Good Boys","Boys"));
		out(isSubString1("Pranil Takawane Good Boys","nil"));
		out(isSubString2("Pranil Takawane Good  Boys","  "));
		
	}

	private static <T>void out(T object) {
		System.out.println(object);
	}

	private static Object isSubString(String string, String string2) {
		return string.matches("(.*)"+string2+"(.*)");
	}
	private static boolean isSubString1(String string, String string2) {
		return string.contains(string2);
	}
	private static Object isSubString2(String string, String string2) {
		return string.indexOf(string2)!=-1;
	}
}
