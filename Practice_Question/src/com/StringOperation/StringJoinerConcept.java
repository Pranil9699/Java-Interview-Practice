package com.StringOperation;

import java.util.StringJoiner;

public class StringJoinerConcept {
public static void main(String[] args) {
	/*
	 * What is StringJoiner ? -- In JDK 8
	 * 
	 */
	StringJoiner stringJoiner = new StringJoiner("->", "{", "}");
	stringJoiner.add("Pranil").add("Love's").add("Shradha");
	System.out.println(stringJoiner.toString());
	
}
}
