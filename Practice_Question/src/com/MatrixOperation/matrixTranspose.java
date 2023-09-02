package com.MatrixOperation;

import java.util.Scanner;

public class matrixTranspose {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter total rows :");
		int rows = sc.nextInt();
		System.out.println("Enter total columns :");
		int cols = sc.nextInt();
		int simpleMatrix[][] = new int[rows][cols];

		System.out.println("For Simple Matrix->");
		getData(simpleMatrix);
		showMatrix(simpleMatrix);

		int transposeMatrix[][] = new int[cols][rows];
		convertToTranspose(simpleMatrix, transposeMatrix);
		System.out.println("The Transpose Matrix Is : ");
		showMatrix(transposeMatrix);
	}

	private static void convertToTranspose(int[][] simpleMatrix, int[][] transposeMatrix) {

		for (int i = 0; i < transposeMatrix[0].length; i++) {
			for (int j = 0; j < transposeMatrix.length; j++) {
				transposeMatrix[j][i] = simpleMatrix[i][j];
			}
		}
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
