package com.OopsOperation.InterfaceConcept;

public sealed interface Car permits Bmw {

	/*
	 * The Using interface keyword we can create the Abstract Class
	 * 
	 * The Interface Must have only abstract Method and no method body are not declared inside the interface class
	 * Bcause The That Method will be declared inside the child class which are Implements the interface method
	 * 
	 * no need abstract keyword 
	 * 
	 * 
	 * but In JDK 1.8 intriduce new feacture ->>****
	 * Interface can have static method with its body in Interface
	 * No need to override the static method in child class
	 * 
	 * also in JDK 8 they Introduce :
	 * 
	 * default method which can we write inside interface with its body 
	 * the default method will accesiable by TOP Casting ( interface referance var) and child class referance var 
	 * default method can't be override
	 * 
	 * 
	 * In interface can have instance , final , static variable by declaring only instance variable 
	 * no need of static and final keyword
	 * 
	 * 
	 * This Type of class are perform 100% abstraction
	 * 
	 * 
	 * important concept  -:
	 *                     if one class implements 2 or more interface and one method will common then in child class no need to override no of times that method , only one time need to override that method
	 *                     
	 */
	int gear=4;
	public void start();
	public static void swim() {
		System.out.println("Car is Swimming...");
	}
	public void stop();
	public void run();
	default void move() {
		System.out.println("Car is Moving...");
	}
	
}




