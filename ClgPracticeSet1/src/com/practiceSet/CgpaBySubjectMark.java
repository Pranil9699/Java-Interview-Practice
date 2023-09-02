package com.practiceSet;

import java.util.Arrays;

public class CgpaBySubjectMark {
	public static void main(String[] args) {
		int Marks[] = new int[] { 100, 98, 98, 99 };
		// get grade from the marks
		float[] grades = getGrades(Marks);
		// calculate the Average grade points
		float averageGradePoint = getAverageGradePoint(grades);
		// Display CGPA
		System.out.println("The CGPA from The Marks Is : " + averageGradePoint);
	}

	private static float getAverageGradePoint(float[] grades) {
		float sum = 0;
		for (float f : grades) {
			sum += f;
		}
		return sum / grades.length;
	}

	private static float[] getGrades(int[] marks) {
		float grades[] = new float[marks.length];
		int j = 0;
		for (int i : marks) {

			if (i > 90)
				grades[j++] = (float) 4.0 + (i / 60);
			else if (i < 90 && i > 70)
				grades[j++] = (float) 3.0 + (i / 60);
			else
				grades[j++] = (float) 2.0 + (i / 60);

		}
		return grades;
	}
}
