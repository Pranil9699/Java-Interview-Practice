package com.Final$Finally$FinalizeConcept;

//public class FinalConcept extends Parent{  The type FinalConcept cannot subclass the final class Parent
public class FinalConcept{

	public static void main(String[] args) {
		final int a;
		a = 30; // this will give you error Because When We declared As Final and you declared
				// its value then after declaration you cant change that value
System.out.println("hi");
	}

	/*
	void check() {
		      error : Cannot override the final method from Parent
	}
	*/

}
/*
final class  Parent{
	
}
class Parent {
	final void check() {
	 System.out.println("For Overriding");
	}
}
/*
/*
 * Important Concept of Use Final Keyword: 1)final variable value cant change
 * second time 2)final class can't be inherited 3)final method can't be override
 */

