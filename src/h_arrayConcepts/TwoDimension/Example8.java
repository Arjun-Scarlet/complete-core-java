package h_arrayConcepts.TwoDimension;

//Sum of left & right diagonal elements in 2d array using single loop
public class Example8 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{1,3,5,7}};
		int sum = 0, len = a.length;
		for(int i=0; i<a.length; i++) {
			sum+=a[i][i];
			if(len%2!=0 && i==len/2) continue;
			sum+=a[i][len-1-i];
		}
		System.out.println("Sum of elements: "+sum);
	}

}