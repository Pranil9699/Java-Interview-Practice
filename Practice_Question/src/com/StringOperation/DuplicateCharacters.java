package com.StringOperation;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharacters {

	/*
	 * How to Print Duplicate Characters From String?
	 */
	public static void main(String[] args) {
Map<Character, Integer> map = new HashMap<Character,Integer>();

		String string="Pranil Takawane";
		string = string.toLowerCase().trim();
	    char[] charArray = string.toCharArray();
	    for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);

			}
		}

	    map.forEach((k,v) ->{
	    	if(v>1) {
	    		System.out.println(k+" : "+v);
	    	}
	    });
		
	}

}
