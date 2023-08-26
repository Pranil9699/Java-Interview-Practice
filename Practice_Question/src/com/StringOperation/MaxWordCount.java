package com.StringOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MaxWordCount {

	static String path = "C:\\Users\\prani\\Core_Java\\Practice_Question\\src\\com\\StringOperation\\file.txt";

	public static void main(String[] args) {

		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		BufferedReader reader = null;
		String dum="";
		try {
			reader = new BufferedReader(new FileReader(path));
			String readLine = reader.readLine();
            dum+=" "+readLine;
			while (readLine != null) {
				String[] words = readLine.toLowerCase().split(" ");

				for (String string : words) {
					if (!string.isBlank()) {
						if (wordMap.containsKey(string)) {
							wordMap.put(string, wordMap.get(string) + 1);
						} else {
							wordMap.put(string, 1);
						}
					}
				}

				readLine = reader.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		wordMap.forEach((k, v) -> System.out.println(k + " : " + v));
		Set<Entry<String, Integer>> SingleMap = wordMap.entrySet().stream()
				.filter(e -> e.getValue() == Collections.max(wordMap.values())).collect(Collectors.toSet());
	
	System.out.println("Final Result Map is :"+SingleMap);
	}
	
}
