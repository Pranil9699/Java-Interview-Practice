package com.InterfaceConcept;

public class ChildClass extends ParentClass {

	private String firstName;
	static {
	    System.out.println("Im static block From ChildClass");
	}
	public ChildClass(String firstName,String secondName,String originName,String region) {
		super(secondName,originName,region);
		this.firstName=firstName;
		System.out.println("Intiolization of ChildClass Instance");
	}
	
//	public void me() {
//		System.out.println("Child");
//	}
	
	public String Name() {
		return this.firstName+" "+super.Name();
	}
}
