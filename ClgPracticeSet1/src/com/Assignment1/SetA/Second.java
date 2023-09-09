package com.Assignment1.SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Second {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
	int newNum=getReverseNumber(number);
	System.out.println("Number is :"+number+" And reverse Number Is :"+newNum);

}

private static int getReverseNumber(int number) {
	int newNum=0;
	while(number!=0) {
		newNum=newNum*10+(number%10);
		number/=10;
	}
	return newNum;
}
}
