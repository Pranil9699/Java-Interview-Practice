package com.practiceSet;

import java.util.Scanner;

class StudentCBSCBoardMarks{
	int array[]=new int[5];
	double percentage;
}

public class findPercentage {
	public static void main(String[] args) {

		StudentCBSCBoardMarks marksOfStudent = new StudentCBSCBoardMarks();
		
		for (int i = 0; i < marksOfStudent.array.length; i++) {
			marksOfStudent.array[i]=new Scanner(System.in).nextInt();		
		}
		int sum=0;
		for (int marks : marksOfStudent.array) {
			sum+=marks;
			System.out.println(marks+": "+sum);
		}
		System.out.println(sum/5.0);
		marksOfStudent.percentage=(double)(sum/500)*100;
		System.out.println(marksOfStudent.percentage);
		
	}
}
