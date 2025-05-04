package h_arrayConcepts;

//Merging two sorted arrays
import java.util.Arrays;
public class Example15 {
	static void merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k] = a[i];
				k++;
				i++;
			}
			else {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k] = b[j];
			k++;
			j++;
		}
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 5, 7};
		int[] b = {-1, 7, 10, 19, 64};
		int[] c = new int[a.length+b.length];
		System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(b));
		merge(a, b, c);
		System.out.println(Arrays.toString(c));
	}

}
