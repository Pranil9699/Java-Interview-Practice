package com.practiceSet;

import java.util.Scanner;

public class SumOfThreeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
		int sumOfNumber = getSumOfNumber(num1,num2,num3);
		System.out.println("Sum Of Number : "+sumOfNumber);
	}

	private static int getSumOfNumber(int num1, int num2, int num3) {
		return (num1+num2+num3);
	}

}
