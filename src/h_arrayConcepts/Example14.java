package h_arrayConcepts;

// Shift zeros into right side
import java.util.Arrays;
public class Example14 {

	public static void main(String[] args) {
		int[] a = {10, 0, 5, 7, 0, 0, 2};
		int[] res = new int[a.length];
		int left = 0, right = a.length-1;
		for(int i=0; i<a.length; i++) {
			int temp = a[i];
			if(temp==0) {
				res[left] = a[i];
				left++;
			}
			else {
				res[right] = a[i];
				right--;
			}
		}
		System.out.println("Original array: "+Arrays.toString(a));
		System.out.println("Modified array: "+Arrays.toString(res));
	}

}
