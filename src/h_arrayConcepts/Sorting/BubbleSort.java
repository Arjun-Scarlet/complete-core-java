package h_arrayConcepts.Sorting;

import java.util.Arrays;

public class BubbleSort {
	static void sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {7, 3, 5, 2, 10, 19, 64, 7, -1};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
