package com.slip.no1;

import java.util.*;

public class MainClass1 {

	public static void main(String[] args) throws Exception {
		// problem 1
		
		LinkedList<String> Fruits = new LinkedList<String>();
		Fruits.add("Apple");
		Fruits.add("Banana");
		Fruits.add("Guava");
		Fruits.add("Orange");
		
		Iterator<String> iterator = Fruits.iterator();
		System.out.println("Fruits Are : ");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
		
		
		// problem 2
		
		
		Circle circle = new Circle(10, 15);
		System.out.print("\nArea :");
		circle.area();
		System.out.print("Volumn :");
		circle.volumn();
		
		// problem 3 
		
		
		Student student = new Student(4204,"Pranil Takawane",14,"DSA");
		if(student.getAge()>=15 && student.getAge()<=21) {
			System.out.println("age is :"+student.getAge());
		}else {
			throw new Exception("Age is not in Range");
		}
	}
}
