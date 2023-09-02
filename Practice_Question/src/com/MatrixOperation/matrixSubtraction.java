package com.MatrixOperation;

import java.util.Scanner;

public class matrixSubtraction {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter total rows :");
		int rows = sc.nextInt();
		System.out.println("Enter total columns :");
		int cols = sc.nextInt();
		int data1[][] = new int[rows][cols];
		int data2[][] = new int[rows][cols];
		System.out.println("For First Matrix->");
		data1 = getData(data1);
		showMatrix(data1);
		System.out.println("For Second Matrix->");
		data2 = getData(data2);
		showMatrix(data2);
		int subResult[][] = new int[rows][cols];
		subResult=subMatrix(data1, data2,subResult);
		System.out.println("Result Of Subtraction Matrix's :");
		showMatrix(subResult);

	}

	private static int[][] subMatrix(int[][] data1, int[][] data2, int[][] subResult) {
		for (int i = 0; i < subResult[0].length; i++) {
			for (int j = 0; j < subResult.length; j++) {
				subResult[i][j]=data1[i][j]-data2[i][j];
			}
		}
		return subResult;
	}

	private static void showMatrix(int[][] data) {

		for (int[] rows : data) {
			for (int cols : rows) {
				System.out.print(cols + " ");
			}
			System.out.println();
		}

	}

	private static int[][] getData(int[][] data) {
		System.out.println("Enter the Data :");
		for (int i = 0; i < data[0].length; i++) {
			for (int j = 0; j < data.length; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		return data;
	}

}
