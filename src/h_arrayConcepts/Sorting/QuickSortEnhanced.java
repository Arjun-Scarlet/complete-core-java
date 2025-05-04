package h_arrayConcepts.Sorting;

import java.util.Arrays;
public class QuickSortEnhanced {
	static void sort(int[] a, int start, int end) {
		if(start>=end) return;
		int i = start, j = end;
		int pivot = a[(start+end)/2];
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		sort(a, start, j);
		sort(a, i, end);
	}
	public static void main(String[] args) {
		int[] arr = {7, 3, 5, 2, 10, 19, 64, 7, -1};
		System.out.println(Arrays.toString(arr));
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
