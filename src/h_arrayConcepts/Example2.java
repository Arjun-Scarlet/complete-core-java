package h_arrayConcepts;

// Reference share in array (as a formal parameter)
import java.util.Arrays;
public class Example2 {
	static void m1(int[] a) { // variable is local but both reference address are same
		for(int i=0; i<a.length; i++) {
			a[i]++;
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(arr));
		m1(arr);
		System.out.println(Arrays.toString(arr));
	}

}
