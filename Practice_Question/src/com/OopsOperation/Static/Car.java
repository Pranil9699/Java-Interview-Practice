package com.OopsOperation.Static;

public class Car {

	//method hiding
	public static void start() {
		System.out.println("Car is Started...");
	}
	public static void start(int a) {
		System.out.println("Car is Started...");
	}

	public void run() {
		System.out.println("Car is Running...");
	}

	public void stop() {
		System.out.println("Car is Stop...");
	}
}
