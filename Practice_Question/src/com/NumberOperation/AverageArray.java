package com.NumberOperation;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {1,2,3,4,5,3,2,3,4,0};
		int total=0;
		for (int i : num) {
			total+=i;
		}
		System.out.println("Average Number is : "+total/num.length);
		
		System.out.println("***********");
		System.out.println("Using java 8 stream");
		OptionalInt min = Arrays.stream(num).min();
		System.out.println("Minimum Number is : "+min.getAsInt());

		OptionalInt max = Arrays.stream(num).max();
		System.out.println("Maximum Number is : "+max.getAsInt());

	
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println("Average Number is : "+avg.getAsDouble());
}

}
