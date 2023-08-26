package com.StringOperation;

import java.util.*;

public class CharCount {
public static void main(String[] args) {
	
	
	System.out.println(getCharCount(" pranil Takwane ; , "));
	System.out.println(getCharCount("praniljsjocnecinhrieu"));
	System.out.println(getCharCount("123323311213"));
	
}

private static HashMap<Character,Integer> getCharCount(String string) {
    HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	char[] charArray = string.toCharArray();
	for (char c : charArray) {
		if(!String.valueOf(c).isBlank()) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else {
			map.put(c, 1);
		}
		}
	}
	
	//System.out.println(map.toString());
	return map;
	
}
}
