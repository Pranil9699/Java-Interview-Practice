package com.NumberOperation;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = new Scanner(System.in).nextInt();
		
		boolean check=checkPalindromeNumber(number);
		if(check){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean checkPalindromeNumber(int number) {
		int revNumber=getReverseNumber(number);
		System.out.println(revNumber);
		return revNumber==number;
	}

	private static int getReverseNumber(int number) {
		int result =0;
		while(number!=0) {
			result=result*10+(number%10);
			number/=10;
		}
		return result;
	}
}
