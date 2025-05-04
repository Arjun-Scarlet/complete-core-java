package h_arrayConcepts.TwoDimension;

//Returning 2d array address(i.e: returns address of group of single dimensional array)
import java.util.Arrays;
public class Example2 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------");
		System.out.println(Arrays.toString(arr));
	}
}
