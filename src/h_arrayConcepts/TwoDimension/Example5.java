package h_arrayConcepts.TwoDimension;

//Sum of diagonal elements in 2d array using 2 loops
public class Example5 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{1,3,5,7}};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i==j)
				sum+=a[i][j];
			}
		}
		System.out.println("Sum of elements: "+sum);
	}

}
