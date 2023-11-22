package com.assignment2.series;

public class CapitalString {
    public static String capitalizeFirstLetter(String input) {
        

       if(input.length()!=0) {
    	   if(input.charAt(0)>='a'&&input.charAt(0)<='z') {
    		   
    		   input=input.replace(input.charAt(0), (char) (input.charAt(0)-32));
    	   }
    	   return input;
       }
	return "String is empty";
    }
}
