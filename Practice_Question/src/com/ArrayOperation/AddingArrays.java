package com.ArrayOperation;

import java.util.Arrays;
import java.util.stream.Stream;

public class AddingArrays {

	public static void main(String[] args) {
		String[] array1= {
				"Pranil",
				"Sujit",
				"Snehal",
				"Kartik",
				"Arya",
				"Rohan",
				"Yash"
		};
		String[]array2= {
				"Nandini",
				"Pritam",
				"Akansha"
		};
		Stream<String> stream1 = Arrays.stream(array1);
		Stream<String> stream2 = Arrays.stream(array2);
	
		String[] CombinedArray = Stream.concat(stream1,stream2).toArray(e -> new String[e]);
		for (String string : CombinedArray) {
			System.out.println(string);
		}
		
		
		
	}
}
