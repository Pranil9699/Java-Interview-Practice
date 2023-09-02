package com.NumberOperation;

public class IsNumber {

	public static void main(String[] args) {
		
		boolean isNumber = isNumber("123a");
		if(isNumber) {
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}

	private static boolean isNumber(String string) {
		
		try {
			Long.parseLong(string);
			return true;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
