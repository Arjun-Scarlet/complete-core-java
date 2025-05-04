package h_arrayConcepts;

// Reference share in array by assigning
import java.util.Arrays;
public class Example3 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a;
		System.out.println(Arrays.toString(a));
		for(int i=0; i<b.length; i++) {
			b[i]++;
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
	}

}
