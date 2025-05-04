package h_arrayConcepts;

// Largest element in the array
public class Example5 {

	public static void main(String[] args) {
		int[] arr = {7, 3, 5, 2, 0, 19, 64};
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) max = arr[i];
		}
		System.out.println("Largest element in array: "+max);
	}

}
