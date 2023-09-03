package com.OopsOperation.InterfaceConcept;

public class TestCar {

	public static void main(String[] args) {
	
		  Bmw bmw = new Bmw();
		  bmw.start();
		  bmw.gear();
		  bmw.stop();
		  bmw.run();
		  bmw.move(); // default method inside interface
		  
		  
		  
		  Car car= new Bmw();
		  
		  car.start();
		  car.run();
		  car.stop();
		  Car.swim();// static method in interface
		  car.move(); // default method inside interface
		  
	}

}
