package com.OopsOperation.InterfaceConcept;

public class TestCar {

	public static void main(String[] args) {
	
		  Bmw bmw = new Bmw();
		  bmw.start();
		  bmw.gear();
		  bmw.stop();
		  bmw.run();
		  
		  
		  
		  Car car= new Bmw();
		  car.start();
		  car.run();
		  car.stop();
		  
		  
	}

}
