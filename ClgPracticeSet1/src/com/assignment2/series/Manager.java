package com.assignment2.series;
import java.util.*;
class Manager extends Employee {
    private double bonus;

    public void accept(int i) {
        super.accept(i); // call the accept method from the base class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Manager Bonus: ");
        bonus = scanner.nextDouble();
    }

    public void display() {
        super.display(); // call the display method from the base class
        System.out.println("Manager Bonus: " + bonus);
    }
    public double totalSalary() {
    	return super.salary+this.bonus;
    }
}