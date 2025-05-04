package h_arrayConcepts.TwoDimension;

// Sum of elements in 2d array
public class Example4 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9,10}};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++)
				sum+=a[i][j];
		}
		System.out.println("Sum of elements: "+sum);
	}

}
