package h_arrayConcepts.TwoDimension;

// Transpose of matrix
import java.util.Scanner;
public class Example9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++)
				a[i][j] = sc.nextInt();
		}
		
		int row = a.length;
		int col = a[0].length;
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
