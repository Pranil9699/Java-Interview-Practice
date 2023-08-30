package com.Patterns;

public class StarPattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 5; j >0 ; j--) {
//				System.out.print("*");			}
//			for (int j = 0; j <=i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("* ");

			}
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			for (int j = i; j >= 0; j--) {
				System.out.print(" ");
			}

			System.out.println();
		}
	}

}
