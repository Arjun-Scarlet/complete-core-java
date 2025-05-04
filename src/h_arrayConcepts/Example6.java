package h_arrayConcepts;

// Smallest element in the array
public class Example6 {

	public static void main(String[] args) {
		int[] arr = {7, 3, 5, 2, 10, 19, 64};
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) min = arr[i];
		}
		System.out.println("Smallest of array element: "+min);
	}

}
