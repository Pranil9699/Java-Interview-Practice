package com.HandlingError;

public class StackOverFlowError {

	static int count=1;

	public static void main(String[] args) {

		printnum();
		System.out.println("Done-Bye...");
		// right click cursor -> run as -> configuration -> which file name -> arguments -> VM arguments ->  write "-Xss2m" ( for 2 MB) -> Apply  -> run
	}

	private static void printnum() {
		if(count<=100000) {
			System.out.println("Hello");
			count++;
			printnum();
		}
	}

}
