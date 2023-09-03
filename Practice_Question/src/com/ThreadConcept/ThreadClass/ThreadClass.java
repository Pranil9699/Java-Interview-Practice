package com.ThreadConcept.ThreadClass;

class Runner extends Thread {

	@Override
	public void run() {

		for (Integer i = 0; i < 10; i++) {

			System.out.println("Running : " + i);

		}

	}

}

public class ThreadClass {

	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.start();
		Runner runner1 = new Runner();
		runner1.start();

	}

}
