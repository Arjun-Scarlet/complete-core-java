package h_arrayConcepts.Searching;

// using recursion
import java.util.*;
public class BinarySearchRec {
	static int search(int[] a, int key, int start, int end) {
		if(start>end) return -1;
		int mid = (start+end)/2;
		if(a[mid]==key) return mid;
		else if(a[mid]>key)
			return search(a, key, start, mid-1);
		else
			return search(a, key, mid+1, end);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {7, 3, 5, 2, 10, 19, 64, 7, -1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter key: ");
		int key = sc.nextInt();
		System.out.println(search(arr, key, 0, arr.length));
		sc.close();
	}

}
