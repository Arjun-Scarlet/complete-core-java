package h_arrayConcepts;

// Second largest element in array
public class Example7 {

	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 10, 19, 64, 7};
		int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
    	
    	for(int i=0; i<a.length; i++) {
    		if(a[i]>max1) {
    			max2 = max1;
    			max1 = a[i];
    		}
    		else if(a[i]>max2 && a[i]!=max1) max2 = a[i];
    	}
		System.out.println("Second largest element: "+max2);
	}

}
