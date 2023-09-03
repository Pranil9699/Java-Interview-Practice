package com.StringOperation;

import java.util.HashMap;
import java.util.Map;

public class ElementPercentage {
	public static void main(String[] args) {

		String test = "Pranil Takawane @-09003434902094935";

		getPercentage(test).forEach((k, v) -> System.out.println(k + " : " + v));
	}

	private static Map<String, Float> getPercentage(String test) {

		Map<String, Float> map = new HashMap<String, Float>();
		
		map.put("UpperCaseCharacter", 0f);
		map.put("LowerCaseCharacter", 0f);
		map.put("Digits", 0f);
		map.put("SpecialCharacter", 0f);
		for (int i = 0; i < test.length(); i++) {
			char ch = test.charAt(i);

			if (Character.isUpperCase(ch)) {
				map.put("UpperCaseCharacter",(float)map.get("UpperCaseCharacter")+1);
			}else if(Character.isLowerCase(ch)) {
				map.put("LowerCaseCharacter",(float)map.get("LowerCaseCharacter")+1);
			}else if(Character.isDigit(ch)) {
				map.put("Digits",(float)map.get("Digits")+1);
			}else {
				map.put("SpecialCharacter",(float)map.get("SpecialCharacter")+1);
			}
		}
		
		map.put("UpperCaseCharacter",(float) ((map.get("UpperCaseCharacter")*100.0)/test.length()));
		map.put("LowerCaseCharacter", (float) ((map.get("LowerCaseCharacter")*100.0)/test.length()));
		map.put("Digits", (float) ((map.get("Digits")*100.0)/test.length()));
		map.put("SpecialCharacter", (float) ((map.get("SpecialCharacter")*100.0)/test.length()));
		
		return map;
	}
}
