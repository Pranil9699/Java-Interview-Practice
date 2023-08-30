package com.StringOperation;

import java.util.Scanner;

public class CharacterOccurrence {
public static void main(String[] args) {
	
	String string = "Im Pranil Takawane".toLowerCase();

	out(countOccurrence(new Scanner(System.in).next().charAt(0),string));
	out(usingStreamCount(new Scanner(System.in).next().charAt(0),string));
	
}

private static Integer usingStreamCount(char charAt, String string) {

	Integer count = (int)string.chars().mapToObj(e->String.valueOf((char)e)).filter(e-> e.equals(""+charAt)).count();
	
	return count;
}

private static <T>void out(T countOccurrence) {

	System.out.println("The Occurrence of That Char is :"+countOccurrence);
}

private static Integer countOccurrence(char charAt, String string) {
	int count=0;
	for (int i = 0; i < string.length(); i++) {
		if(string.charAt(i)==charAt) {
			count++;
		}
	}
	
	
	return count;
}

}
