package com.DigitOfNumber;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we can generate the Random Number by # different Ways 1) Used The Random()
		 * class object 2) USed The Math.random() function 3) used the
		 * ThreadLocalRandom.current().nextDouble()
		 * 
		 */

		System.out.println("The First Simple Way to Generated the random value ");
		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			System.out.println("Random String " + random.nextLong());
			System.out.println("Random String " + random.nextInt());
			System.out.println("Random String " + random.nextDouble());
			System.out.println("Random String " + random.nextFloat());
			System.out.println("Random String " + random.nextBoolean());

		}
		System.out.println("The second way to Generate the using ThreadLocalRandom.current().type ");

		for (int i = 0; i < 5; i++) {
			System.out.println("Random String " + ThreadLocalRandom.current().nextLong(1, 10000));// range 1 to 10000
			System.out.println("Random String " + random.nextInt());
			System.out.println("Random String " + random.nextDouble());
			System.out.println("Random String " + random.nextFloat());
			System.out.println("Random String " + random.nextBoolean());

		}
		System.out.println("The second way to Generate the using Math.random()  ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Random String " + Math.random() * 10); // between upto 10
			System.out.println("Random String " + random.nextInt());
			System.out.println("Random String " + random.nextDouble());
			System.out.println("Random String " + random.nextFloat());
			System.out.println("Random String " + random.nextBoolean());

		}

	}

}
