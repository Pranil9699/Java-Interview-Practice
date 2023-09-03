package com.ThreadConcept;

import java.util.Scanner;

class Processor extends Thread {

	private volatile boolean running = true;

	@Override
	public void run() {

		while (running) {

			System.out.println("Hello");

			try {
				Thread.sleep(100);
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}
	
	public void shutdown() {
		running=false;
	}

}

public class BasicThreadSynchronization {

	public static void main(String[] args) {

		Processor processor = new Processor();
		processor.start();
		System.out.println("Press Enter To Stop...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		processor.shutdown();
	}

}
