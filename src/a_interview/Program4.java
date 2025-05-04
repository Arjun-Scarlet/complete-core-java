package a_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program4 {

	static int[] sort(List<Integer> l) {
		int[] a = new int[l.size()];
		for(int i=0; i<a.length; i++) a[i] = l.get(i);
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	static int[] reverse(List<Integer> l) {
		int[] a = new int[l.size()];
		int j = 0;
		for(int i=l.size()-1; i>=0; i--) {
			a[j++] = l.get(i); 
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a = {11,25,30,7,15,9,0,2,8,19,18};
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		int index = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) index = i;
		}
		for(int i=0; i<index; i++) {
			l1.add(a[i]);
		}
		for(int i=index+1; i<a.length; i++) {
			l2.add(a[i]);
		}

		int[] left = sort(l1);
		int[] right = reverse(l2);
		
		for(int i=0; i<index; i++) {
			a[i] = left[i];
		}
		index = index+1;
		for(int i=0; i<right.length; i++) {
			a[index++] = right[i];
		}
		System.out.println(Arrays.toString(a));
	}
}










