package com.InterfaceConcept;

public class OriginClass implements Indian,American{

	private String familyName;

	static {
	    System.out.println("Im static block From OriginClass");
	}
	public OriginClass(String familyName,String region) {

		this.familyName = familyName;
		System.out.println("Intiolization of OriginClass Instance");
		this.Region(region);
	}
	public void me() {
		System.out.println("Origin");
	}
	@Override
	public void Region(String region) {
		System.out.println("My Region from "+region);
	}
	public String Name() {
		return this.familyName;
	}
}
