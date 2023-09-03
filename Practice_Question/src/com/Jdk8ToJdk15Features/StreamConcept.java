package com.Jdk8ToJdk15Features;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamConcept {

	public static void main(String[] args) {

//		System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e -> e%2==0).count());

//		Stream.of(1,2,3,4,5,6,4,7,8,4,2,8,9).distinct().forEach(e->System.out.println(e+": "));

		Stream.of(1, 2, 3, 4, 5, 6, 4, 7, 8, 4, 2, 8, 9).sorted().forEach(System.out::println);

//		Optional :
		String[] s = new String[5];
//		s[2] = "Pranil";
		Optional<String> nullable = Optional.ofNullable(s[2]);

		if (nullable.isPresent()) {
			System.out.println(s[2] + " " + s[2].length());
		} else {
			System.out.println("Value Is Not Available");
		}

		nullable.ifPresentOrElse(e -> System.out.println(e.length()), new Runnable() {

			@Override
			public void run() {
				System.out.println("Value is not Available");

			}
		});

		Optional<String> nothing = Optional.empty();

		// in JDK 12 : new Switch Case we Come
		var n = 3;
		var m = switch (n) {
		case 1 -> "One";
		case 2 -> "Two";
		case 3 -> "Third";
		case 4 -> "Four";
		default -> "Number Not Found";
		};

		System.out.println(m);

		// JDK 13 : Multi-Line String
		// Json , Xml

//		var response="""{
//                "Name":"Pranil"
//                "Age":"20"
//		}""";

		// System.out.println(response);

		
		
		
		/// JDK 14 : record 
		System.out.println();
		System.out.println();
		System.out.println();
		Employee employee = new Employee("Peter",24,"SFO");
		System.out.println(employee.name());
		System.out.println(employee.age());
		System.out.println(employee.position());
		
		
		//JDK 15 : sealed Classes
		// which are used to permits only some classes for that interface 
	}

}
