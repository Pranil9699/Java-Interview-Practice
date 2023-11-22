package com.slip.no2;

public class Purches_Order extends Order{

	
	public void accept(int id, String description, String customerName) {
		super.accept(id, description);
		this.customerName = customerName;
	}
	public String display() {
		return super.display()+" Customer Name : "+this.customerName;
	}

	
	private String customerName;
	
	
}
