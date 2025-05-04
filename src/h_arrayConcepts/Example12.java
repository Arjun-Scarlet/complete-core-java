package h_arrayConcepts;

// Print the unique elements
public class Example12 {

	public static void main(String[] args) {
		int[] a = {10, 2, 5, 7, 12, 5, 2};
		int[] fake = new int[a.length];
		System.out.print("Unique elements:");
		for(int i=0; i<a.length; i++) {
			if(fake[i]==0) {
				int temp = a[i], cnt = 1;
				for(int j=i+1; j<a.length; j++) {
					if(temp==a[j]) {
						cnt++;
						fake[j]=1;
					}
				}
				if(cnt==1) System.out.print(" "+a[i]);
			}
		}
	}
}
