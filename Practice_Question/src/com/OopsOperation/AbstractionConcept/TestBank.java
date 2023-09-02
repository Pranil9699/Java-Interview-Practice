package com.OopsOperation.AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		UCObank ucoBank = new UCObank();
		/*
		 * The abstract classes are faster than interface 
		 * The Child Class can Have Access of Parent class non method abstract method As
		 * Well AS The Own Class MEthod
		 * 
		 * 
		 */
		ucoBank.lone(); // abstract class method
		ucoBank.credit(); // override method
		ucoBank.debit(); // override method
		ucoBank.checkAccountBalance(); // instance method

		System.out.println(ucoBank.z); // static variable of abstract method
		System.out.println(ucoBank.y); // final variable of abstract method
		System.out.println(ucoBank.x); // instance variable of abstract method

		System.out.println("-----------------------");

		/*
		 * We can also Perform the Polymorphisum
		 * 
		 */
		Bank bank = new UCObank();

		bank.lone(); // abstract class method
		bank.credit(); // instance method
		bank.debit(); // instance method
//		bank.checkAccountBalance(); this method is accessiable by parent class 

		System.out.println(Bank.z); // static variable of abstract method
		System.out.println(bank.y); // final variable of abstract method
		System.out.println(bank.x); // instance variable of abstract method

	}
}
