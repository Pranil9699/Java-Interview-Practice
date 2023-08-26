package com.ArrayOperation;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;

import java.util.stream.Collectors;

public class FindDublicationElement {

	public static void main(String[] args) throws Exception {
		// this program actually finding the Dublication of Element In The Array
		System.out.println("Enter the Array Element ");
		String Array[] = new String[10];
		try (Scanner scanner = new Scanner(System.in)) {
			for (int i = 0; i < 10; i++) {
				Array[i] = scanner.next();
			}
		}

		System.out.println("****Brute Force****** ");
		for (int i = 0; i < Array.length; i++) {
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[i].equals(Array[j])) {
					System.out.println(Array[i]);
				}
			}
		}

		System.out.println("*****HashSet******");
		Set<String> Set = new HashSet<String>();
		for (String string : Array) {
			if (Set.add(string) == false) {
				System.out.println(string);
			}
		}

		System.out.println("******Hash Map*****");
		HashMap<String, Integer> ArrayMap = new HashMap<String, Integer>();
		for (String string : Array) {
			Integer count = ArrayMap.get(string);
			if (count == null)
				ArrayMap.put(string, 1);
			else
				ArrayMap.put(string, ++count);
		}
		Set<Entry<String, Integer>> EnterySet = ArrayMap.entrySet();
		for (Entry<String, Integer> entry : EnterySet) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey());
		}

		System.out.println("*****Streams set And Filter*******");
		Set<String> DataSet = new HashSet<String>();
		Set<String> collect = Arrays.asList(Array).stream().filter(obj -> !DataSet.add(obj))
				.collect(Collectors.toSet());
		collect.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("******Streams Grouping BY*******");
		Set<String> collect2 = Arrays.asList(Array).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
		collect2.forEach(obj -> {
			System.out.println(obj);
		});

		System.out.println("Streams Using Frequency");
		List<String> list = Arrays.asList(Array);
		list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet()).forEach(e -> {
			System.out.println(e);
		});
	}
}
