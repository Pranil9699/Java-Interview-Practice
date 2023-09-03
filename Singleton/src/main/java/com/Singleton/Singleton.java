package com.Singleton;

/**
 * Hello world!
 *
 */
public class Singleton {
	/*
	 * In OOps Singleton is class that can only have once object (instance of the class) at a time.
	 * How to design Singleton class.
	 *  
	 *  1. Make Constructor as private
	 *  2. write a publis static method ( getInstance) that has return type of object of this singleton class.
	 */
	
	public static Singleton singleton = null;

	public String x;

	private Singleton() {
		x = "Hey I am using SingleTon Class Pattern";
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public static void main(String[] args) {

		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		instance.x=(instance.x).toLowerCase();
		
		System.out.println(instance.x);
		System.out.println(instance.x=instance1.x.toUpperCase());
		System.out.println(instance2.x);
	}
}
