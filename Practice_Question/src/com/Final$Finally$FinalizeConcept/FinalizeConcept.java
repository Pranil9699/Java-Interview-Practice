package com.Final$Finally$FinalizeConcept;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("This Will Be finalize method");
	}
	public static void main(String[] args) {
		FinalConcept FinalConcept1 = new FinalConcept();
		FinalConcept FinalConcept2 = new FinalConcept();

		
		FinalConcept1 = null;
		FinalConcept2 = null;
		
//		finalize();
//		System.gc();

	}

	

}
