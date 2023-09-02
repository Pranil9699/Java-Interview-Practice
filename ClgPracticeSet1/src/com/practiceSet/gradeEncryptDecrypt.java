package com.practiceSet;

import java.util.Scanner;

public class gradeEncryptDecrypt {

	public static void main(String[] args) {
		char c = new Scanner(System.in).next().charAt(0);
		System.out.println("The Original Grade is :" + c);
		c = (char) ((char) c + '8');
		System.out.println("The Encrypted Grade is :" + c);
		c = (char) ((char) c - '8');
		System.out.println("The Decrypted Grade is :" + c);

		float a = 4 * 9 / 2;
		System.out.println(a);
		a = 7 / a;
		System.out.println(a);
		a=7 /4 * 9 / 2;
		System.out.println(a);

	}
}
