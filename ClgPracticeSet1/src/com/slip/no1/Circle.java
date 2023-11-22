package com.slip.no1;

public class Circle implements Operation {

	private int radius;
	private int height;
	
	public Circle(int radius,int height) {
		this.radius=radius;
		this.height=height;
		
	}
	
	@Override
	public void area() {
		System.out.println(PI*this.radius*this.radius);
	}

	@Override
	public void volumn() {
		// TODO Auto-generated method stub
		System.out.println(PI*this.radius*this.radius*this.height);

	}

}
