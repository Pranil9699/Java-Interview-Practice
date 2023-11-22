package returing_Array;
import java.util.Scanner;

class Array{
	// inserting Array element 
	void insert(int [][]x) {
		Scanner sc = new Scanner(System.in);
		for(int i =0 ; i< x.length; i++) {
			for(int j = 0 ; j<x[0].length;j++)
				x[i][j]=sc.nextInt();
		}
	}
	// printing array
	void show(int [][] x) {
		for(int i =0 ; i< x.length; i++) {
			for(int j = 0 ; j<x[0].length;j++)
				System.out.print(x[i][j]+" ");
			System.out.println();
		}
	}
	// addition of array 
	int[][] get(int [][]x,int [][]y){
		int z[][] = new int[x.length][x[0].length];
		for(int i =0 ; i< x.length; i++) {
			for(int j = 0 ; j<x[0].length;j++)
				z[i][j]=x[i][j]+y[i][j]; 
			//System.out.println();
		}
		return z;
	}
}
public class Return_Array {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Array obj = new Array();
	// which type array needed
	System.out.println("Enter your Row Size");
	int row=sc.nextInt();
	System.out.println("Enter your Col Size");
	int col=sc.nextInt();
	int x[][] = new int[row][col];
	System.out.println("Enter the Element in the X Array ");
	obj.insert(x);
	int y[][] = new int[row][col];
	System.out.println("Enter the Element in the Y Array ");
	obj.insert(y);	
	System.out.println("The Array X : ");
	obj.show(x);
	System.out.println("The Array Y : ");
	obj.show(y);
	int z[][] = new int [row][col];
	z = obj.get(x, y);
	System.out.println("The Addition of x and y array is : ");
	obj.show(z);
	}
}
