package h_arrayConcepts;

import java.util.Arrays;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1; // array reference declaration
		arr1 = new int[5]; // array instantiation
		System.out.print("Enter array with 5 size: ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("arr1 => "+Arrays.toString(arr1)); // used to print array as a string
		
		// array direct declaration-1
		int[] arr2 = {5,6,7,8,9,10};
		System.out.println("arr2 => "+Arrays.toString(arr2));
		
		// array direct declaration-2
		int[] arr3 = new int[] {1,2,3,4,5};
		System.out.println("arr3 => "+Arrays.toString(arr3));
		sc.close();
	}

}
