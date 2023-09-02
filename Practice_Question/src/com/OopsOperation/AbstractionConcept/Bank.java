package com.OopsOperation.AbstractionConcept;

public abstract class Bank {

	/*
	 * The Using abstract keyword we can create the Abstract Class
	 * 
	 * The Abstract Class Must have one abstract Method The abstract method body are
	 * not declared inside the abstract class Because The That Method will be
	 * declared inside the child class which are extends the abstract method
	 * 
	 * The Abstract Class Can have Instantce Method The non abstract method body is
	 * declared in abstract method Because of They Method are Comman For all Child
	 * CLass
	 * 
	 * 
	 * The abstract class can have instance , final , static variable
	 * 
	 * 
	 * This Type of class are not perform 100% abstraction
	 * 
	 */
	int x = 20;
	final int y = 30;
	static int z = 40;

	public abstract void lone();

	public void credit() {
		System.out.println("Bank -> Credit");
	}

	public void debit() {
		System.out.println("Bank -> Debit");
	}

}
