package h_arrayConcepts.TwoDimension;

// Addition of matrix
public class Example10 {
	static void addMatrix(int[][] a, int[][] b, int[][] c){
		if(a.length!=b.length || a[0].length!=b[0].length) return;
		int row = a.length, col = a[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
	}
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,7},{7,8,9}};
		int[][] b = {{2,4,7},{1,3,5},{1,2,5}};
		int[][] c = new int[a.length][a[0].length];
		addMatrix(a, b, c);
		for(int[] arr:c) {
			for(int n:arr) System.out.print(n+" ");
			System.out.println();
		}
	}
}
