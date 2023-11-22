package com.slip.no2;

import java.util.Iterator;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//problem 1
		
		Scanner scanner = new Scanner(System.in);
		
		int array[]=new int[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter "+(i+1)+" Value : ");
			array[i] = scanner.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		System.out.println("Maximum Element is : "+max);
		
		//problem 2
		Purches_Order purches_Order1 = new Purches_Order();
		purches_Order1.accept(4001,"It's a Good Product for Floor cleaning","Pranil Takawane");
		Purches_Order purches_Order2 = new Purches_Order();
		purches_Order2.accept(4002,"It's a intermidiat Product for Floor cleaning","Prajwal Takawane");
		Purches_Order purches_Order3 = new Purches_Order();
		purches_Order3.accept(4001,"It's a Good Product for Floor cleaning","Pranil Takawane");
        
		System.out.println(purches_Order1.display());
		System.out.println(purches_Order2.display());
		System.out.println(purches_Order3.display());
		
		
	}
}
