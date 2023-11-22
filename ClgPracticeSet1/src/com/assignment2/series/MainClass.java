package com.assignment2.series;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// problem 2
		Scanner scanner = new Scanner(System.in);
//		FibonacciSeries fibonacciSeries = new FibonacciSeries(9);
//		CudeOfNumber cudeOfNumber = new CudeOfNumber(9);
//		SquareOfNumber squareOfNumber = new SquareOfNumber(9);
//		fibonacciSeries.getFiboSeries();
//		cudeOfNumber.getCube();
//		squareOfNumber.getSquare();
//		
//		    
		// problem 3
//	        System.out.print("Enter the number of Managers: ");
//	        int n = scanner.nextInt();
//
//	        Manager[] managers = new Manager[n];
//
//	        // Accept details for each Manager
//	        for (int i = 0; i < n; i++) {
//	            System.out.println("Enter details for Manager " + (i + 1));
//	            managers[i] = new Manager();
//	            managers[i].accept(i);
//	        }
//
//	        // Display details for each Manager
//	        for (int i = 0; i < n; i++) {
//	            System.out.println("\nDetails for Manager " + (i + 1));
//	            managers[i].display();
//	        }
//	        
//	        double max=Double.MIN_VALUE;
//	        int no=0;
//	        for (int i = 0; i < managers.length; i++) {
//				
//	        	if(managers[i].totalSalary()>max) {
//	        		max=managers[i].totalSalary();
//	        		no=i;
//	        	}
//			}
//	        System.out.println("Maximun salary for this emp : ");
//	        managers[no].display();
//	        

		// problem 4

//		Person person = new Person("pranil","pune");
//		person.displayNameWithCapital();

		// problem 5
//		class Employee {
//		    String name;
//		    double salary;
//
//		    // Parameterized constructor for Employee class
//		    public Employee(String name, double salary) {
//		        this.name = name;
//		        this.salary = salary;
//		    }
//
//		    // Method to display details of Employee
//		    public void displayDetails() {
//		        System.out.println("Employee Name: " + name);
//		        System.out.println("Employee Salary: " + salary);
//		    }
//		}
//
//		class Developer extends Employee {
//		    String projectName;
//
//		    // Parameterized constructor for Developer class
//		    public Developer(String name, double salary, String projectName) {
//		        super(name, salary); // Call the constructor of the superclass
//		        this.projectName = projectName;
//		    }
//
//		    // Method to display details of Developer
//		    public void displayDetails() {
//		        super.displayDetails(); // Call the method of the superclass
//		        System.out.println("Project Name: " + projectName);
//		    }
//		}
//
//		class Programmer extends Developer {
//		    String progLanguage;
//
//		    // Parameterized constructor for Programmer class
//		    public Programmer(String name, double salary, String projectName, String progLanguage) {
//		        super(name, salary, projectName); // Call the constructor of the immediate superclass (Developer)
//		        this.progLanguage = progLanguage;
//		    }
//
//		    // Method to display details of Programmer
//		    public void displayDetails() {
//		        super.displayDetails(); // Call the method of the immediate superclass (Developer)
//		        System.out.println("Programming Language: " + progLanguage);
//		    }
//		}
//
//		
//		        // Create an object of Programmer class
//		        Programmer programmer = new Programmer("John Doe", 75000.0, "ProjectX", "Java");
//
//		        // Display details of the Programmer
//		        System.out.println("Details of the Programmer:");
//		        programmer.displayDetails();

		// problem 6

		interface CreditCardInterface {
			void viewCreditAmount();

			void useCard(double amount);

			void payCredit(double amount);

			void increaseLimit(double increaseAmount);
		}

		class SilverCardCustomer implements CreditCardInterface {
			String name;
			long cardNumber;
			double creditAmount;
			double creditLimit;

			// Constructor for SilverCardCustomer class
			public SilverCardCustomer(String name, long cardNumber) {
				this.name = name;
				this.cardNumber = cardNumber;
				this.creditAmount = 0;
				this.creditLimit = 50000;
			}

			// Implementing methods from CreditCardInterface
			@Override
			public void viewCreditAmount() {
				System.out.println("Credit Amount for " + name + ": " + creditAmount);
			}

			@Override
			public void useCard(double amount) {
				if (creditAmount + amount <= creditLimit) {
					creditAmount += amount;
					System.out.println("Transaction successful. Credit Amount updated.");
				} else {
					System.out.println("Transaction failed. Exceeds credit limit.");
				}
			}

			@Override
			public void payCredit(double amount) {
				if (amount <= creditAmount) {
					creditAmount -= amount;
					System.out.println("Payment successful. Credit Amount updated.");
				} else {
					System.out.println("Payment failed. Insufficient credit amount.");
				}
			}

			@Override
			public void increaseLimit(double increaseAmount) {
				System.out.println("Silver Card Customers cannot increase credit limit.");
			}
		}

		class GoldCardCustomer extends SilverCardCustomer {
			int increaseLimitCount;

			// Constructor for GoldCardCustomer class
			public GoldCardCustomer(String name, long cardNumber) {
				super(name, cardNumber);
				this.creditLimit = 100000;
				this.increaseLimitCount = 0;
			}

			// Override increaseLimit method for GoldCardCustomer
			@Override
			public void increaseLimit(double increaseAmount) {
				if (increaseLimitCount < 3 && increaseAmount <= 5000) {
					creditLimit += increaseAmount;
					increaseLimitCount++;
					System.out.println("Credit Limit increased for Gold Card Customer. New Limit: " + creditLimit);
				} else {
					System.out.println("Cannot increase credit limit. Limit reached or invalid amount.");
				}
			}
		}

		// Create objects of SilverCardCustomer and GoldCardCustomer
		SilverCardCustomer silverCustomer = new SilverCardCustomer("John Silver", 1234567890123456L);
		GoldCardCustomer goldCustomer = new GoldCardCustomer("Jane Gold", 9876543210987654L);

		// Perform operations on SilverCardCustomer
		silverCustomer.viewCreditAmount();
		silverCustomer.useCard(20000);
		silverCustomer.viewCreditAmount();
		silverCustomer.payCredit(10000);
		silverCustomer.viewCreditAmount();

		// Perform operations on GoldCardCustomer
		goldCustomer.viewCreditAmount();
		goldCustomer.useCard(70000);
		goldCustomer.viewCreditAmount();
		goldCustomer.increaseLimit(3000);
		goldCustomer.increaseLimit(6000);
		goldCustomer.viewCreditAmount();
		goldCustomer.increaseLimit(2000);
		goldCustomer.viewCreditAmount();

	}
}
