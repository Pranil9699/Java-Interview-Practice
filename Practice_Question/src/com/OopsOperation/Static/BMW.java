package com.OopsOperation.Static;

public class BMW extends Car {

	
	public static  void start() {
		System.out.println("BMW Is Started...");
	}
	
	static final int x=20;
	static {
		System.out.println("Done.");
	}

}
