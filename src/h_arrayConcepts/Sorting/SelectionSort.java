package h_arrayConcepts.Sorting;

import java.util.Arrays;

public class SelectionSort {
	static void sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			int min = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) min = j;
			}
			if(i!=min) {
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
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
