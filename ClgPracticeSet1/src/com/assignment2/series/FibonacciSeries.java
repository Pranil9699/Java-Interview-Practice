package com.assignment2.series;

public class FibonacciSeries {

	private int num;

	public FibonacciSeries(int i) {
		this.num = i;
	}

	public void getFiboSeries() {
		int first = 0, second = 1;
		int third = 0;

		System.out.print("Fibonacci Series is :" + first + "," + second);
		while (third < this.num) {
			third = first + second;
			System.out.print("," + third);
			first = second;
			second = third;
		}
	}

}
