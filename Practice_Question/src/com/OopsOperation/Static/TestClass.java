package com.OopsOperation.Static;

public class TestClass {

	public static void main(String[] args) {
		/*
		 * When We Declared The variable as A static and final inthat case java comipler will not load the class soo no .class file created 
		 * but when we declared that variable only static in that time compiler will load the class soo 
		 * Its A tricky Question 
		 */
		System.out.println(Main.x);
		System.out.println(BMW.x);
	}
}
class Main{
	public static final int x = 10;
	static {
		System.out.println("Main --Class Static Block...");
	}
}
