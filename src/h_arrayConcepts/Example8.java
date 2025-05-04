package h_arrayConcepts;

// Second smallest element in array
public class Example8 {

	public static void main(String[] args) {
		int[] a = {5, 3, -4, 78, 23, 8, 5};
		int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
    	
    	for(int i=0; i<a.length; i++) {
    		if(a[i]<min1) {
    			min2 = min1;
    			min1 = a[i];
    		}
    		else if(a[i]<min2 && a[i]!=min1) min2 = a[i];
    	}
		System.out.println("Second smallest element: "+min2);
	}

}
