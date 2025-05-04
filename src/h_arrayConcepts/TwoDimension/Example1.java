package h_arrayConcepts.TwoDimension;

import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr1; // array reference declaration
		arr1 = new int[3][4]; // array instantiation
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++)
				System.out.print(arr1[i][j]+" ");
			System.out.println();
		}
	
		// array direct declaration
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++)
				System.out.print(arr2[i][j]+" ");
			System.out.println();
		}
		sc.close();
	}

}