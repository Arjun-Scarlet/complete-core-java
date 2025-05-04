package z_Java_Problems.p1ArraysProblem;

// Find the missing numbers in the array
import java.util.*;

public class Test5 {

	public static void main(String[] args) {
    	int[] a = {91,98,94,95,96};
    	Arrays.sort(a);
    	int min = a[0], max = a[a.length-1];
    	HashSet<Integer> h = new HashSet<Integer>();
    	for(int i=0; i<a.length; i++) {
    		h.add(a[i]);
    	}
    	for(int i=min; i<=max; i++) {
    		if(h.add(i)) {
    			System.out.println("Missing number: "+i);
    		}
    	}
	}
}
