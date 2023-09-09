package com.Assignment1.SetC;

import java.util.Scanner;

import com.Assignment1.SetA.MyDate;

class Person {
	private int id;
	private String name;
	private MyDate dob;
	private static int cnt = 1;

	public Person(int id, String name, MyDate dob) {
		System.out.println("Im Now In Constructor");
		this.id = id;
		this.name = name;
		this.dob = dob;
		Person.cnt += 1;
	}

	public Person() {
	}

	public void accept(Person person) {
		System.out.println("Im Now In Accept Method");
		this.id = person.id;
		this.name = person.name;
		this.dob = person.dob;
	}

	public void display() {
		System.out.println("Person Id :" + this.id + " Person Name :" + this.name + " Person Dob :");
		this.dob.displayDate();
	}
}

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] persons = new Person[n];
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Enter " + (i + 1) + " Data :");

			int no = sc.nextInt();
			String name = sc.next();
			MyDate mydate = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
			if (i % 2 == 0) {
				persons[i] = new Person(no, name, mydate);
			} else {
				persons[i] = new Person();
				persons[i].accept(new Person(no, name, mydate));
			}

		}
		System.out.println("Person Data is :");
		for (int i = 0; i < persons.length; i++) {
			persons[i].display();
		}

	}

}
