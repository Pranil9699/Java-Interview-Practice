package com.NumberOperation;

public class FindMissingNumber {
public static void main(String[] args) {
	
	int num[]= {1,2,3,4,6,7,8,9,10};
	out(findMissingNumber(num,10));
}

private static <T>void out(Object object) {
System.out.println(object);	
}

private static Object findMissingNumber(int[] num, int i) {

	int expSum = i* (i+1)/2;
	int actualSum=0;
	for (int j : num) {
		actualSum+=j;
	}
	
	return expSum-actualSum;
}
}
