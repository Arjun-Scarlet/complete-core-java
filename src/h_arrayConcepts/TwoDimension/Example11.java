package h_arrayConcepts.TwoDimension;

//Multiplication of matrix
public class Example11 {
	static void mulMatrix(int[][] a, int[][] b, int[][] c){
		if(a.length!=b.length || a[0].length!=b[0].length) return;
		int len = a.length;
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				for(int k=0; k<len; k++)
					c[i][j] += a[i][k]*b[k][j];
			}
		}
	}
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,7},{2,4,6}};
		int[][] b = {{2,4,1},{1,2,3},{6,2,5}};
		int[][] c = new int[a.length][a[0].length];
		mulMatrix(a, b, c);
		for(int[] arr:c) {
			for(int n:arr) System.out.print(n+" ");
			System.out.println();
		}
	}
}
