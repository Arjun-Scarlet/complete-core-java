package z_Java_Problems.p1ArraysProblem;

// Arrange all the zeros in right side of an array
import java.util.Arrays;

public class Test6_1 {

	public static void main(String[] args) {
    	int[] a = {7,0,2,3,0,5,6,7,0};
    	int k=0;
    	for(int i=0; i<a.length; i++) {
    		if(a[i]!=0) {
    			int temp = a[i];
    			a[i] = a[k];
    			a[k] = temp;
    			k++;
    		}
    	}
    	System.out.println(Arrays.toString(a));
    }
}
