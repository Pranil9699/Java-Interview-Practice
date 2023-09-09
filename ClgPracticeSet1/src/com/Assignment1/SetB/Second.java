package com.Assignment1.SetB;
import java.util.Scanner;
class Employee{
	private String name;
	private float salary;
	Scanner sc=new Scanner(System.in);
	public void setData() {
		System.out.println("Enter Name:");
		this.name=sc.next();
		System.out.println("Enter Salary:");
		this.salary=sc.nextFloat();
	}
	public void displayData() {
		System.out.println("Name: "+this.name+" Salary: "+this.salary);
	}
	
}
public class Second {

	public static void main(String[] args) {
		
		Employee[] employee = new Employee[5];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setData();
		}
		for (int i = 0; i < employee.length; i++) {
			employee[i].displayData();
		}
	}

	
}
