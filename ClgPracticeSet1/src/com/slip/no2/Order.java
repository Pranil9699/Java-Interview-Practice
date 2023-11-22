package com.slip.no2;

public class Order {

	private int id;
	private String description;

	public void accept(int id, String description) {

		this.id = id;
		this.description = description;
	}

	public String display() {

		return "Id : " + this.id + " , description : " + this.description;
	}

}
