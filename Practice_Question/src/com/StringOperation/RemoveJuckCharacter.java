package com.StringOperation;

public class RemoveJuckCharacter {
public static void main(String[] args) {
	String s1="6843#$%###%%# Pranil Takawane (()*(3488hf";
	String s2="6'''''4@@#@#$$ranil Takawane (()*(3488hf";
	
	s1=s1.replaceAll("[^a-zA-Z0-9]", "");
	s2=s2.replaceAll("[^a-zA-Z0-9]", "");

System.out.println(s1);
System.out.println(s2);

}
}
