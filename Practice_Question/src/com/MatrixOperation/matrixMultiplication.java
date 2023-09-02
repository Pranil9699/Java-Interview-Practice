package com.MatrixOperation;

import java.util.Scanner;

public class matrixMultiplication {

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
		int mulResult[][] = new int[rows][cols];
		mulResult = mulMatrix(data1, data2, mulResult);
		System.out.println("Result Of Multiplication Matrix's :");
		showMatrix(mulResult);

	}

	private static int[][] mulMatrix(int[][] data1, int[][] data2, int[][] mulResult) {
		for (int i = 0; i < mulResult[0].length; i++) {
			for (int j = 0; j < mulResult.length; j++) {
				for (int k = 0; k < mulResult.length; k++) {
					mulResult[i][j] += data1[i][k] * data2[k][j];					
				}
			}
		}
		
		return mulResult;
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
