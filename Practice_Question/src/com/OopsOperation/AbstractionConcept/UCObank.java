package com.OopsOperation.AbstractionConcept;

public class UCObank extends Bank{

	@Override
	public void lone() {
		System.out.println("UCObank -> lone");
	}

	public void checkAccountBalance() {
		System.out.println("UCObank -> Checking The Balance..");
	}
//	@Override
//	public void credit() {
//		System.out.println("UCObank -> credit");
//	}
//
//	@Override
//	public void debit() {
//		System.out.println("UCObank -> debit");
//	}
//	

	
}
