package com.Assignment1.SetA;

public class MyDate{
	int dd,mm,yy;

	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public MyDate() {
		this.dd = 12;
		this.mm = 9;
		this.yy = 2023;
	}
	public void displayDate() {
		System.out.println("Date : "+this.dd+"/"+this.mm+"/"+this.yy);
	}
	
}