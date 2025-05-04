package h_arrayConcepts.Searching;

// without recursion
import java.util.*;
public class BinarySearch {
	static int search(int[] a, int key) {
		int start = 0, end = a.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(a[mid]==key) return mid;
			else if(a[mid]>key) start = mid+1;
			else end = mid-1;
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {7, 3, 5, 2, 10, 19, 64, 7, -1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter key: ");
		int key = sc.nextInt();
		System.out.println(search(arr, key));
		sc.close();
	}
}
