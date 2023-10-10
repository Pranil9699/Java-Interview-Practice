package com.collection;

import java.util.Scanner;

import com.collection.list.NewList;
import com.collection.set.NewSet;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			out("Choose Option : ");
			out("1 -> List Collection \t2 -> Set Collection \t3 -> Map Collection");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				out("Choose Option : ");
				out("1 -> ArrayList \t2 -> LinkedList \t3 -> Vector");
				int option1 = scanner.nextInt();
				NewList newList = new NewList();
				switch (option1) {
				case 1:
					newList.arrayList();

					break;
				case 2:
					newList.linkedList();
					break;
				case 3:
					newList.vector();
					break;
				default:
					out("Invalid Option Choose");
				}
				break;
				
				
			case 2:
				out("Choose Option : ");
				out("1 -> sortedset \t2 -> enumset \t3 -> linkedhashset\t4 -> hashset\t5-> treeset");
				int option11 = scanner.nextInt();
				NewSet newSet = new NewSet();
				switch (option11) {
				case 1:
					newSet.sortedSet();

					break;
				case 2:
					newSet.enumSet();
					break;
				case 3:
					newSet.linkedHashSet();
					break;
				case 4:
					newSet.hashSet();
					break;
				case 5:
					newSet.treeSet();
				default:
					out("Invalid Option Choose");
				}
				break;

			default:
				out("Invalid Option Choose");
			}
			if (option != 1 || option != 2 || option != 3) {
				break;
			}
		}
	}

	public static <T> void out(T t) {
		System.out.println(t);
	}
}
