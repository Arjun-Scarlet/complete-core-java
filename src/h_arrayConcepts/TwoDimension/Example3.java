package h_arrayConcepts.TwoDimension;

import java.util.Arrays;
public class Example3 {
	public static void main(String[] args) {
		int[][] a = new int[3][];// creating 2d array without initialization
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("-----------");
		//declaring different size for each array
		a[0] = new int[5];
		a[1] = new int[4];
		a[2] = new int[3];
		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

}