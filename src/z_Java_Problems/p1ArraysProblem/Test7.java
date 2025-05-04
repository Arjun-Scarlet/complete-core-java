package z_Java_Problems.p1ArraysProblem;

// Eliminate the duplicates in an array
import java.util.*;

public class Test7 {

	public static void main(String[] args) {
		int[] a = {4, 2, 8, 4, 7, 2, 9, 8, 1, 7, 3, 6, 3, 5, 9};
		int max = Integer.MAX_VALUE, cnt = 0;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					cnt++;
					a[i] = max;
				}
			}
		}
		System.out.println(cnt);
		int[] b = new int[a.length-cnt];
		int j = 0;
		for(int i:a) {
			if(i!=max) b[j++] = i;
		}
		a = b;//storing new array into the given array
		System.out.println(Arrays.toString(a));
	}
}
