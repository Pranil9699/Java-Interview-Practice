package com.NullConcept;

public class NullConcept {

	/*
	 * There are the Diferent Concept of Null value About The Differeent Object
	 */
	public static void main(String[] args) {

		// 1. case sensetive
		Object object = null;

		// 2. default ref value will be null
		System.out.println(object);

		// 3. The
		Integer i = 20;
		int j = i;
		System.out.println((j == i) + " : " + j);

		// 4. instanceof
		Integer a = null;
		Integer b = 10;

		// System.out.println((a instanceof Integer )+ ":"+a.getClass());
		System.out.println(b instanceof Integer);

		// 5. static method vs non static method access by null referance
		NullConcept nullConcept=null;
		//nullConcept.send(); // in this line The Object of This NullConcept is not created soo the ref variable not pointing to any object in heap section 
		// soo in case of non-static method are not visiable or not pointed by any object and that why this cant call this nonstatic method 
		
		
		nullConcept.sum(); // in case of static method stored inside stack memory soo ref variable also stored inside the stack memory 
		// stack to stack it call  soo it executed by ref.staticMethod
		
		//6.
		String str=(String)null;
		Integer i1=null;
		Integer d1=null;

		//System.out.println(str.charAt(0));// the String will be Null Soo inside it no value (only and only null value in that)
		System.out.println(str+"123".length()); // look carefully here the null+"123".length() give you 3 because null will distory and only 123 is there string
		
		System.out.println(i1==d1);
		
	}

	public static void sum() {
		System.out.println("sum...");
	}

	public void send() {
		System.out.println("Send...");
	}
}
