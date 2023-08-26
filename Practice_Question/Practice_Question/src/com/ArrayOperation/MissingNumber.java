package com.ArrayOperation;

public class MissingNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-4,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
		int sum=0;
	   for (int i : array) {
		sum+=i;
	}
	   int acutalSum=0;
	   for(int i =array[array.length-1];i>=array[0];i--) {
		   acutalSum+=i;
		   System.out.println(i);
	   }
	   System.out.println(sum+" : "+acutalSum);
	   System.out.println("Missing Number Is: "+(acutalSum-sum));
	
	
	}
}
