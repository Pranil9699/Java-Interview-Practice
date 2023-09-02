package com.OopsOperation.Static;

public class CanWeOverideStaticMethod {
	public static void main(String[] args) {
  
		// we can't override the static method in inheritance
		
//		Car car=new Car();
//		new BMW();
//		car.start();
//		BMW.start();
		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.run();
//		System.out.println(Integer.MAX_VALUE);
		
	}
}
