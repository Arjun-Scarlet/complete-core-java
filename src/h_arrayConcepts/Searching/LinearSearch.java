package h_arrayConcepts.Searching;

import java.util.*;
public class LinearSearch {
	static int search(int[] a, int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {7, 3, 5, 2, 10, 19, 64, 7, -1};
		System.out.print("Enter key: ");
		int key = sc.nextInt();
		System.out.println(search(arr, key));
		sc.close();
	}

}
