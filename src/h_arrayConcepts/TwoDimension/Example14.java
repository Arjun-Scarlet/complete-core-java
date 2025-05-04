package h_arrayConcepts.TwoDimension;

/*
Spiral of number 
n = 5:
1	2	3	4	5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9 
*/
import java.util.Scanner;
public class Example14 {
	static int[][] spiral(int n){
		int[][] a = new int[n][n];
		int row = 0, col = -1;
		char move = 'r';
		for(int i=1; i<=n*n; i++) { //it is for iteration, not for array
			switch(move) {
				case 'r':
					col++;
					a[row][col] = i;
					if(col==n-1 || a[row][col+1]!=0) move = 'd';
					break;
				case 'd':
					row++;
					a[row][col] = i;
					if(row==col) move = 'l';
					break;
				case 'l':
					col--;
					a[row][col] = i;
					if(col==0 || a[row][col-1]!=0) move = 'u';
					break;
				case 'u':
					row--;
					a[row][col] = i;
					if(row==1 || a[row-1][col]!=0) move = 'r';
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = spiral(n);
		
		for(int[] arr:a) {
			for(int num:arr) System.out.print(num+"\t");
			System.out.println();
		}
		sc.close();
	}

}
