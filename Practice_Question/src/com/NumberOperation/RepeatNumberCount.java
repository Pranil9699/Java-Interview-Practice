package com.NumberOperation;

import java.util.*;

/*
 * Check the Digit count of each and print it all 
 */
public class RepeatNumberCount {

//	public static void main(String[] args) {
////		int Number = (int) (Math.random()*100000000);
//		int Number = -199993450;
//		System.out.println("Actual Number :" + Number);
//
//		Map<Integer, Integer> countDigits = new HashMap<Integer, Integer>();
//
//		if (Number == 0) {
//			countDigits.put(Number, 1);
//		} else {
//			while (Number != 0) {
//				int rem = Number % 10;
//				if (countDigits.containsKey(rem)) {
//					countDigits.put(rem, countDigits.get(rem) + 1);
//				} else {
//					countDigits.put(rem, 1);
//				}
//				Number /= 10;
//			}
//		}
//		countDigits.forEach((k, v) -> {
//			System.out.println(k + " : " + v);
//		});
//
//	}
	public static void main(String[] args) {
		int[] Digits = new int[10];
		int Number = -1731959056;
		if ((Number < 0)) {

			while(Number!=0) {
				int rem=Number%10;
				if(Digits[Math.abs(rem)]==0) {
					Digits[Math.abs(rem)] = 1;
				}else {
					Digits[Math.abs(rem)]=Digits[Math.abs(rem)]+1;
				}
				Number/=10;
			}
			int k=0;
			for (int i : Digits) {
				System.out.println("-"+(k++)+" : "+ i);
			}
		} else {

			if (Number == 0) {
				System.out.println(0 + " : " + 1);
			} else {

				while (Number != 0) {

					int rem = Number % 10;
					if (Digits[rem] == 0) {
						Digits[rem] = 1;
					} else {
						Digits[rem] += 1;
					}
					Number /= 10;

				}
				int j = 0;
				for (int i : Digits) {
					System.out.println((j++) + " : " + i);
				}

			}

		}
	}
}
//0 : 1
//1 : 2
//2 : 0
//3 : 1
//4 : 0
//5 : 2
//6 : 1
//7 : 1
//8 : 0
//9 : 2
