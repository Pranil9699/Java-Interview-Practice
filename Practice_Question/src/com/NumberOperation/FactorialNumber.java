package com.NumberOperation;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		int number=new Scanner(System.in).nextInt();
		long findFactorial = findFactorial(number);
		System.out.println(findFactorial);
	}

	private static long findFactorial(int number) {
		if(number==1 || number==0)
			return 1;
		else
			return number*findFactorial(number-1);		
	}

}
