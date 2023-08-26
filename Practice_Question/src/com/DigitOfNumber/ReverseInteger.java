package com.DigitOfNumber;

public class ReverseInteger {

	public static void main(String[] args) {
		
System.out.println(reverseIneteger(7873843));
	}

	private static Integer reverseIneteger(int i) {
		
		int copyNumber=i;
		int newInteger=0;
		while(i>0) {
			
			int rem = i%10;
			newInteger=(rem*10+newInteger);
			i/=10;
			
		}
		
		return null;
	}

}
