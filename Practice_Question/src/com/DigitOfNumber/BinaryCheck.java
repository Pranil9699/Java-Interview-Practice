package com.DigitOfNumber;


import java.util.Scanner;

public class BinaryCheck {

	public static void main(String[] args) {
		
		System.out.println("Enter the Binary Number");
		Scanner scanner = new Scanner(System.in);
		
		
		int nextInt = scanner.nextInt();
		boolean checkNumber = false;
		boolean checkNumberByUsingStringFunction=false;
		boolean checkNumberByUsingIntegerClassMethod =false;
		try {
			checkNumber = checkNumber(nextInt);
			checkNumberByUsingStringFunction = checkNumberByUsingStringFunction(nextInt);
			checkNumberByUsingIntegerClassMethod = checkNumberByUsingIntegerClassMethod(nextInt);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(checkNumber);
		System.out.println(checkNumberByUsingStringFunction);
		System.out.println(checkNumberByUsingIntegerClassMethod);
	}
	private static boolean checkNumber(int Number) {
		
		int copyNumber=Number;
		boolean check=false;
		while(copyNumber!=0)
		{
			int rem = copyNumber%10;
			if(rem>1) {
				check=false;
				break;
			}else {
				copyNumber/=10;
				check=true;
			}
		}	
		return check;
	}
	private static boolean checkNumberByUsingStringFunction(int Number) {
		if(String.valueOf(Number).matches("[0-1]+")) {
			return true;
		}
		return false;

	}
	private static boolean checkNumberByUsingIntegerClassMethod(int Number) {
		try {
			Integer.parseInt(String.valueOf(Number),2);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
}
