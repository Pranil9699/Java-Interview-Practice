package com.assignment1.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainClassP1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		for (int i = 1; i <=10; i++) {
			System.out.println(number +" * "+i+" = "+(number*i));
		}
		int reverseNum=0;
		
		while(number!=0) {
			int rem = number%10;
			reverseNum=(reverseNum*10)+rem;
			number/=10;
		}
		System.out.println(reverseNum);
		
		int array[]= {46,676,452,8,3,9655};
		getAsc(array);
		
	}

	private static void getAsc(int[] array) {
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			
			int element = array[i];
			int j=i-1;
			sum+=array[i-1];
			while(element < array[j]) {
				int temp = array[j];
				array[j]=array[i];
				array[i]=temp;
			}
		}
		System.out.println("sum : "+sum);
		Arrays.asList(array).forEach(e -> System.out.println(e));
	}

}
