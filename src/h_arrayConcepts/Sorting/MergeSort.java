package h_arrayConcepts.Sorting;

import java.util.Arrays;
public class MergeSort {
	static void divide(int[] a) {
		if(a.length==1) return;
		int[] left = new int[a.length/2];
		int[] right = new int[a.length-left.length];
		
//		for(int i=0; i<left.length; i++) left[i] = a[i];
		
//		for(int i=0; i<right.length; i++) right[i] = a[left.length+i];
		
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);
		divide(left);
		divide(right);
		merge(left, right, a);
	}
	static void merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++] = a[i++];
			else c[k++] = b[j++];
		}
		//Below loops used if any one of the arrays still has remaining elements after the main merging process is complete
		while(i<a.length) c[k++] = a[i++];
		while(j<b.length) c[k++] = b[j++];
	}
	public static void main(String[] args) {
		int[] arr = {7, 3, 5, 2, 10, 19, 64, 7, -1};
		System.out.println(Arrays.toString(arr));
		divide(arr);
		System.out.println(Arrays.toString(arr));
	}
}
