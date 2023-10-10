package com.collection.list;

import java.util.*;

import com.collection.MainClass;

public class NewList {

	private static ArrayList<String> arrayList = new ArrayList<String>();
	private static LinkedList<String> linkedList = new LinkedList<String>();
	private static Vector<String> vector = new Vector<String>();

	public void arrayList() {

		MainClass.out("What Do You Wann In ArrayList");
		Scanner sc = new Scanner(System.in);
		MainClass.out("Choose Option : ");
		MainClass.out(
				"1 -> addElement \t2 -> removeElement \t3 -> displayArrayList \t 4-> sizeof ArrayList \t 0 -> Exit From ArrayList");
		int option = sc.nextInt();
		switch (option) {
		case 0:
			return;
		case 1:
			MainClass.out("Enter the String To Add In ArrayList:");
			String string = sc.next();
			arrayList.add(string);
			break;
		case 2:
			MainClass.out("Remove the String from ArrayList:");
			int idx = sc.nextInt();
			arrayList.remove(idx);
			break;
		case 3:
			MainClass.out("Elements Of ArrayList Are : ");
//			for (String string2 : arrayList) {
//				MainClass.out(" " + string2 + ",");
//			}
			Iterator<String> iterator = arrayList.iterator();
			while(iterator.hasNext()) {
				MainClass.out(iterator.next()+" ,"); 
			}
			
			break;
		case 4:
			MainClass.out("Size of ArrayList Are : " + arrayList.size());
			break;
		default:
			MainClass.out("Invalid Option Choose");
		}

	}

	public void vector() {
		MainClass.out("What Do You Wann In Vector");
		Scanner sc = new Scanner(System.in);
		MainClass.out("Choose Option : ");
		MainClass.out(
				"1 -> addElement \t2 -> removeElement \t3 -> display Vector \t 4-> sizeof Vector \t 5-> Check Contained Element Or Not \t 0 -> Exit From ArrayList");
		int option = sc.nextInt();
		switch (option) {
		case 0:
			return;
		case 1:
			MainClass.out("Enter the String To Add In Vector:");
			String string = sc.next();
			vector.add(string);
			break;
		case 2:
			MainClass.out("Remove the String from Vector:");
			int idx = sc.nextInt();
			vector.remove(idx);
			break;
		case 3:
			MainClass.out("Elements Of Vector Are : ");
			for (String string2 : vector) {
				MainClass.out(" " + string2 + ",");
			}
			break;
		case 4:
			MainClass.out("Size of Vector Are : " + vector.size());
			break;
		case 5:
			MainClass.out("Enter the String To Check In Vector present or Not:");
			String checkString = sc.next();
			if (vector.contains(checkString)) {
				MainClass.out("It is Present In  Vector");
			} else {
				MainClass.out("It is Not Present In  Vector");
			}
			break;
		default:
			MainClass.out("Invalid Option Choose");
		}

	}

	public void linkedList() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("What Do You Want In LinkedList");
			System.out.println("Choose Option : ");
			System.out.println("1 -> addFirst \t2 -> addLast \t3 -> getFirst \t4 -> getLast");
			System.out.println("5 -> peekFirst \t6 -> peekLast \t7 -> removeFirst \t8 -> removeLast \t0 -> Exit");

			int option = sc.nextInt();

			switch (option) {
			case 0:
				return;
			case 1:
				System.out.println("Enter the String To Add at the Beginning of LinkedList:");
				String stringToAddFirst = sc.next();
				linkedList.addFirst(stringToAddFirst);
				break;
			case 2:
				System.out.println("Enter the String To Add at the End of LinkedList:");
				String stringToAddLast = sc.next();
				linkedList.addLast(stringToAddLast);
				break;
			case 3:
				if (!linkedList.isEmpty()) {
					System.out.println("First Element of LinkedList: " + linkedList.getFirst());
				} else {
					System.out.println("LinkedList is empty.");
				}
				break;
			case 4:
				if (!linkedList.isEmpty()) {
					System.out.println("Last Element of LinkedList: " + linkedList.getLast());
				} else {
					System.out.println("LinkedList is empty.");
				}
				break;
			case 5:
				if (!linkedList.isEmpty()) {
					System.out.println("Peek First Element of LinkedList: " + linkedList.peekFirst());
				} else {
					System.out.println("LinkedList is empty.");
				}
				break;
			case 6:
				if (!linkedList.isEmpty()) {
					System.out.println("Peek Last Element of LinkedList: " + linkedList.peekLast());
				} else {
					System.out.println("LinkedList is empty.");
				}
				break;
			case 7:
				if (!linkedList.isEmpty()) {
					System.out.println("Removed First Element of LinkedList: " + linkedList.removeFirst());
				} else {
					System.out.println("LinkedList is empty.");
				}
				break;
			case 8:
				if (!linkedList.isEmpty()) {
					System.out.println("Removed Last Element of LinkedList: " + linkedList.removeLast());
				} else {
					System.out.println("LinkedList is empty.");
				}
				break;
			default:
				System.out.println("Invalid Option Choose");
			}
		}
	}

}
