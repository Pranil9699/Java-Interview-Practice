package com.Assignment1.SetB;

class MyNumber {
	private int number;

	public MyNumber() {
		number = 0;
	}

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isNegative() {
		if (this.number < 0)
			return true;
		return false;
	}

	public boolean isPositive() {
		if (this.number > 0)
			return true;
		return false;
	}

	public boolean isOdd() {
		if (this.number % 2 != 0)
			return true;
		return false;
	}

	public boolean isEven() {
		if (this.number % 2 == 0)
			return true;
		return false;
	}

}

public class First {
	public static void main(String[] args) {
		MyNumber myNumber = new MyNumber(2);
		System.out.println("Is Negative :" + myNumber.isNegative() + "\nIs Positive :" + myNumber.isPositive()
				+ "\nIs Even :" + myNumber.isEven() + "\nIs Odd :" + myNumber.isOdd());
	}
}
