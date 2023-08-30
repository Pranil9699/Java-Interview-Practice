package com.ArrayOperation;

import java.util.Arrays;

public class ShiftAllZeroToRight {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 0, 9, 0, 4, 1, 2, 1, 0, 1, 3, 34, 1 };
		System.out.println(Arrays.toString(shiftZeroToRight(array)));
	}

	private static int[] shiftZeroToRight(int[] array) {

		if (array.length == 1)
			return array;
		int newArray[] = new int[array.length];
		System.out.println(Arrays.toString(array));
		int count = 0;
		for (int i : array) {
			if (i != 0) {
				newArray[count] = i;
				count++;
			}
		}

		return newArray;
	}

}
