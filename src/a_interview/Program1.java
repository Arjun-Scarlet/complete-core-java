package a_interview;

import java.util.*;

public class Program1 {

	static int[] array(List<Integer> l) {
		int[] a = new int[l.size()];
		for(int i=0; i<a.length; i++) a[i] = l.get(i);
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) { 
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a = {9,17,8,40,11,18,10,1,9,70,101,7,14,20};
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			if(a[i]%10==0) l1.add(a[i]);
			else l2.add(a[i]);
		}
		int[] left = array(l1);
		int[] right = array(l2);
		
		for(int i=0; i<left.length; i++) {
			a[i] = left[i];
		}
		int j = left.length;
		for(int i=0; i<right.length; i++) {
			a[j++] = right[i];
		}
		System.out.println(Arrays.toString(a));
	}
}
