package z_Java_Problems.p1ArraysProblem;

// Arrange all the zeros in right side of an array
import java.util.Arrays;

public class Test6_0 {

	public static void main(String[] args) {
    	int[] a = {7,0,2,3,0,5,6,7,0};
    	int[] temp = Arrays.copyOf(a, a.length);
    	int j = temp.length-1, k=0;
    	for(int i=0; i<temp.length; i++) {
    		if(temp[i]==0) a[j--] = temp[i];
    		else a[k++] = temp[i];
    	}
    	System.out.println(Arrays.toString(a));
    }
}
