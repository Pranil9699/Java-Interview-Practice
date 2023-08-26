package com.BigIntegerClasses;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Scanner;

public class BigIntegerClass {
	public static void main(String[] args) {
//	BigInteger bigInteger1 = new BigInteger("8737758743973775874397377587439");
//	BigInteger bigInteger2 = new BigInteger("8737758743973775874397377587439");
//	BigInteger add = bigInteger1.add(bigInteger2);
//	System.out.println(add);
//	BigInteger multiply = bigInteger1.multiply(bigInteger2);
//	System.out.println(multiply);
//	BigInteger divide = bigInteger1.divide(bigInteger2);
//	System.out.println(divide);
//	

//		for pattern 
//
//A 
//A B 
//A B C 
//A B C D F
//A B C D E 
		for (char i = 'A'; i < 'G'; i++) {
			for (char ch = 'A'; ch <=i; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
		
		
//		for pattern 
//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
//		F F F F F F 

		
		for (char i = 'A'; i < 'G'; i++) {
			for (char ch = 'A'; ch <=i; ch++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		String getString1=scanner.next();
		String getString2=scanner.next();
		if(getString1.trim().equals(getString1 )|| getString2.trim().equals(getString2)) {
			
		}
		
				
	}
}
