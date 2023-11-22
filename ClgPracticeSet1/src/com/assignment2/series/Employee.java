package com.assignment2.series;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    public Employee() {
        // You can initialize default values here if needed
    }

    public void accept(int i) {
        Scanner scanner = new Scanner(System.in);
        this.id=i;
        System.out.print("Enter Employee Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
