package com.ArrayOperation;

public class DataTypeOperation {
public static void main(String[] args) {
	
	int i = (byte)+(char)-(int)+(long)-1;
	/*
	 * Because of first the statement start to execute from 
	 * right to left side which 
	 * long -1 -> -1long type 
	 * int - 1 long -> - 1int type
	 * char- (-1int) -> + 1 char type
	 * byte + 1char -> + 1 byte
	 * and it stored all in the int variable soo the 
	 * answer would be ---> 1
	 * 
	 */
	System.out.println(i);
	
}
}
