package com.ThreadConcept;

   
public class AnonoiousClass {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {

					System.out.println("hello : " + i);

					try {

						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					
					System.out.println("Bye : " + i);
					
					try {
						
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		});
		thread.start();
		thread2.start();
	}
}
