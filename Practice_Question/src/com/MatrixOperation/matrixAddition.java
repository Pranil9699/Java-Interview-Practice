package com.MatrixOperation;

import java.util.Scanner;

public class matrixAddition {
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
		int addResult[][] = new int[rows][cols];
		addResult=addMatrix(data1, data2,addResult);
		System.out.println("Result Of Addition Matrix's :");
		showMatrix(addResult);

	}

	private static int[][] addMatrix(int[][] data1, int[][] data2, int[][] addResult) {
		for (int i = 0; i < addResult[0].length; i++) {
			for (int j = 0; j < addResult.length; j++) {
				addResult[i][j]=data1[i][j]+data2[i][j];
			}
		}
		return addResult;
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
