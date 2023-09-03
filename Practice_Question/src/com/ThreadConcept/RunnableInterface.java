package com.ThreadConcept;

class Runner implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello : " + i);
			int identityHashCode = System.identityHashCode(i);
			System.out.println(identityHashCode);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

public class RunnableInterface {

	public static void main(String[] args) {
		for (int i = 1; i < 100000; i++) {
			Thread thread1 = new Thread(new Runner());
			Thread thread2 = new Thread(new Runner());

			thread1.start();
			thread2.start();

		}
	}
}
