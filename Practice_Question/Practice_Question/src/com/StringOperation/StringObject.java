package com.StringOperation;

public class StringObject {

	public static void main(String[] args) {

/*
 * How many String Objects will be created?
 * Answer : 2
 * 
 */
		
	String s1="Hello World";	 
	String s2="Hello World";	 
	String s3=s1;
	
	System.out.println(s1==s2 && s2==s3 && s1==s3); 
	// here in this case the only one object is created 
	// in  stack having the s1, s2 , s3 but they all have
	//used same copy which is in String Control Pool 
	//(means in heap section) "Hello World"
	
	System.out.println("--------------------------------------------------------------------------------------------------------");
	String obj1 = new String("Hello World");
	String obj2 = new String("Hello World");
	System.out.println(obj1==obj2);
	// it give the false because the two different Hello World Object are Created in Heap Section of Memeory 
	// both are not pointing the same object 
	}

}
