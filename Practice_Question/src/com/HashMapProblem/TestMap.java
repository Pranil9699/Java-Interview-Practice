package com.HashMapProblem;

import java.util.*;

public class TestMap {

	/*
	 * Why HashMap Key Should Be Immutable In Java?
	 * Why String is Popular HashMap key in Java?
	 * 
	 */
	public static void main(String[] args) {
		Map<Employee, String> empMap = new HashMap<Employee,String>();
		Employee e = new Employee("Prannil",2390);
		empMap.put(e, "P");
		e.setNumber(90);
//		empMap.put(e,"A");
		System.out.println(empMap.get(e));
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		String e11="Tom";
		map.put(e11,100);
		System.out.println(map.get(e11));
		e11="Naveen";
		map.put(e11,200);
		System.out.println(map.get(e11));
		System.out.println(map.get("Tom"));
		
		
	}
}
