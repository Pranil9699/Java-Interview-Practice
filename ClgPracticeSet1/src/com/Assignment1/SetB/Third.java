package com.Assignment1.SetB;

import java.util.Scanner;

class Account {
	private int accNo;
	private String accName;
	private float accBalance;

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public float getAccBalance() {
		return accBalance;
	}

	public Account(int accNo, String accName, float accBalance) {

		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}

	public static void sortEmp(Account[] accounts) {

		for (int i = 0; i < accounts.length; i++) {
			for (int j = i + 1; j < accounts.length; j++) {
				if (accounts[i].getAccBalance() > accounts[j].getAccBalance()) {
					Account temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;
				}
			}
		}

	}
	public void displayAccount() {
		System.out.println("AccNo :"+this.accNo+" AccName :"+this.accName+" AccBalance :"+this.accBalance);
	}

}

public class Third {
	public Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();

		Account[] accounts = new Account[n];
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Enter " + (i+1) + " Data :");
			accounts[i] = new Account(new Scanner(System.in).nextInt(), new Scanner(System.in).next(),
					new Scanner(System.in).nextFloat());

		}
		Account.sortEmp(accounts);
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].displayAccount();
		}
	}

}
