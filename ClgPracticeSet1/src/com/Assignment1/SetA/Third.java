package com.Assignment1.SetA;

public class Third {
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 5, 4, 9, 7 ,6,8,10};
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		getAscendingArray(array);
		System.out.println("Sum of Array Element:"+sum);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void getAscendingArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
	}
	
}
