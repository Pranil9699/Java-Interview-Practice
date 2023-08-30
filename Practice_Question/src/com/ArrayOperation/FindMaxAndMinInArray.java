package com.ArrayOperation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindMaxAndMinInArray {
	public static void main(String[] args) {
		int[] array = new int[] { 23, 0,45, 67,-1000, 98, 89 };
		int max=array[0];
		int min=array[0];
		for (int i = 1; i < array.length; i++) {
			if(max<array[i]) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println(array);
		System.out.println(max);
		System.out.println(min);
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
