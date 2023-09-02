package com.practiceSet;

public class replaceSpaceToUnderscores {
	public static void main(String[] args) {
		String string = "Pranil Takawane";
        String newString="";

		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)==' '){
				newString+=string.replace(string.charAt(i), '_');
			}
		}
		System.out.println(newString);
	}

}
