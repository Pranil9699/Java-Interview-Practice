package com.assignment2.series;

public class Person {
    private String name;
    private String city;

    

    public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}



	public void displayNameWithCapital() {
        String capitalizedFirstName = CapitalString.capitalizeFirstLetter(name);
        System.out.println("Person Name with First Letter Capitalized: " + capitalizedFirstName);
    }

    // Other methods for the Person class
}