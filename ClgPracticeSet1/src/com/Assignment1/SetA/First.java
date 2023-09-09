package com.Assignment1.SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class First {
public static void main(String[] args) throws NumberFormatException, IOException {
	int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
	Stream.iterate(5,i->i+number).limit(10).forEach(System.out::println);
	
	
	
}
}
