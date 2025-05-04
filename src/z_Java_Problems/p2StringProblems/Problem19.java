package z_Java_Problems.p2StringProblems;

import java.util.Arrays;
import java.util.Comparator;

// Find the largest common prefix 
public class Problem19 {

	public static void main(String[] args) {
		String[] a = {"flower","flow","flight"};
    	Arrays.sort(a, Comparator.comparing(n->n.length()));
    	System.out.println(Arrays.toString(a));
    	String res = "";
    	boolean flag = false;
    	for(int i=0; i<a[0].length(); i++) {
    		char ch = a[0].charAt(i);
    		for(int j=1; j<a.length; j++) {
    			if(a[j].charAt(i) != ch) {
    				flag = true;
    				break; 			
    			}
    		}
    		if(flag) break;
    		res += ch;
    	}
    	System.out.println("Largest Common Prefix: "+res);
	}
}
