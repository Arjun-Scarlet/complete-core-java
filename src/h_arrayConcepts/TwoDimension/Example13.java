package h_arrayConcepts.TwoDimension;

/* 
Pascal Triangle with space
n = 5:
          1
        1   1
      1   2   1
    1   3   3   1
  1	  4   6   4   1
1	5	10	10	 5   1

*/
import java.util.Scanner;
public class Example13 {
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
		
		int space = n-1;
		for(int arr[]:a) {
			for (int j = 0; j < space; j++) 
		        System.out.print(" ");
			for(int temp:arr) System.out.print(temp+" ");
			System.out.println();
			space--;
		}
		sc.close();
	}
}
