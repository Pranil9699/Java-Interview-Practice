package com.ArrayOperation;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumbers {

	public static void main(String[] args) {
		Object num[] = new Object[100];
		Arrays.fill(num, new Object() {
			int count = 0;

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return Integer.toString(++count);
			}

		});
		System.out.println(Arrays.toString(num));
		
		
		System.out.println("____________________________");
		String string = new BitSet() {{set(1,101);}}.toString();
		System.out.append(string,1,string.length());
	}

}
