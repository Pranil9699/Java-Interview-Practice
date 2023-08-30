package com.StringOperation;

public class RemoveWhiteSpaces {
public static void main(String[] args) {
	/*
	 * Remove All WhiteSpaces from A String
	 * 
	 */
	String newString = "      Thie    is My Java Code";
	System.out.println(newString.replaceAll("\\s+", "").trim());
	String remString="";
	for(int i =0 ; i < newString.length(); i++) {
		
		if(newString.charAt(i)!=' ' && newString.charAt(i)!='\t') {
			remString+=newString.charAt(i);
		}
	}
	System.out.println(remString);
}
}
