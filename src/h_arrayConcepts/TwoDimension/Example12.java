package h_arrayConcepts.TwoDimension;

/* 
Pascal Triangle without space
n = 5:
1
1   1
1   2   1
1   3   3   1
1	4   6   4   1
1	5	10	10	 5   1

*/
import java.util.Scanner;
public class Example12 {
	static int[][] pascal(int n){
		int[][] a = new int[n][];
		for(int i=0; i<a.length; i++) {
			a[i] = new int[i+1];
			for(int j=0; j<a[i].length; j++) {
				if(j==0 || i==j) a[i][j] = 1;
				else a[i][j] = a[i-1][j-1] + a[i-1][j];
			}
		}
		return a; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = pascal(n);
		
		for(int arr[]:a) {
			for(int temp:arr) System.out.print(temp+"  ");
			System.out.println();
		}
		sc.close();
	}
}
