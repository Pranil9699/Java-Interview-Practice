package com.NumberOperation;

public class LongNumber {
	public static void main(String[] args) {

		/*
		 * What will be the Output when you use a Long Number with L and Without L
		 * SUffix?
		 * 
		 */

		long longNumberWithout=1000*60*60*24*365;
		long longNumberWithL=1000*60*60*24*365L;
		
		System.out.println(longNumberWithout);// result -> 1471228928
		System.out.println(longNumberWithL); // result -> 31536000000
		
		// the first long variable is 32 bit because of it havn't attached the L at the end 
		// soo it would be treaded as int variable
		
		// but in second long variable actually the long 64 bit variable 
		// soo the value of it not goes outof bound soo that result would be correct calculation of it
		
		
	
	
	}

}
