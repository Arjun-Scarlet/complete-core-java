package h_arrayConcepts;

// Occurrence of each array elements
public class Example11 {

	public static void main(String[] args) {
		int[] a = {10, 2, 5, 7, 12, 5, 2};
		int[] fake = new int[a.length];
		for(int i=0; i<a.length; i++) {
			if(fake[i]==0) {
				int temp = a[i], cnt = 1;
				for(int j=i+1; j<a.length; j++) {
					if(temp==a[j]) {
						cnt++;
						fake[j] = 1;
					}
				}
				System.out.println(a[i]+"'s occurrence: "+cnt);
			}
		}
	}
}
