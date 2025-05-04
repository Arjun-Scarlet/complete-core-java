package z_Java_Problems.p1ArraysProblem;

// Find maximum product of a triplet (subsequence of size 3) in array
import java.util.*;

public class Test9_1 {

	public static void main(String[] args) {
		int[] a = {10, 3, 5, 6, 20};
		int l = a.length-1;
		Arrays.sort(a);
		/* By comparing maximum of multiplication of largest 3 numbers and multiplication 
		of 1st two smallest and one largest number, we will get maximum product triplet */
		int max = Math.max(a[l]*a[l-1]*a[l-2], a[0]*a[1]*a[l]);
		System.out.println("Maximum product of triplet: "+max);
	}
}
