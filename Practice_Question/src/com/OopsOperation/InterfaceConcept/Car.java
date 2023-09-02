package com.OopsOperation.InterfaceConcept;

public interface Car {

	/*
	 * The Using interface keyword we can create the Abstract Class
	 * 
	 * The Interface Must have only abstract Method and no method body are not declared inside the interface class
	 * Bcause The That Method will be declared inside the child class which are Implements the interface method
	 * 
	 * no need abstract keyword 
	 * 
	 * 
	 * In interface can have instance , final , static variable by declaring only instance variable 
	 * no need of static and final keyword
	 * 
	 * 
	 * This Type of class are perform 100% abstraction
	 * 
	 */
	int gear=4;
	public void start();
	public void stop();
	public void run();
	
}




