package com.InterfaceConcept;

public class ParentClass extends OriginClass {

	private String secondName;
	public ParentClass(String secondName, String originName,String region) {
		super(originName,region);
		this.secondName =secondName;

		System.out.println("Intiolization of ParentClass Instance");
	}


	static {
	    System.out.println("Im static block From ParentClass");
	}
//	public void me() {
//		System.out.println("Parent");
//	}
	public String Name() {
		return this.secondName+" "+super.Name();
	}
}
