package z_Java_Problems.p1ArraysProblem;

// Find maximum product of a triplet (subsequence of size 3) in array

public class Test9_0 {

	public static void main(String[] args) {
		int[] a = {10, 3, 5, 6, 20};
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length-2; i++) {
			for(int j=i+1; j<a.length-1; j++) {
				for(int k=0; k<a.length; k++) {
					int mul = a[i]*a[j]*a[k];
					if(mul>max) max = mul;
				}
			}
		}
		System.out.println("Maximum product of triplet: "+max);
	}
}
