import java.util.*;

// 10 100 20 50 8 200 60 80 10 40
public class Practice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n*2];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int mh = Integer.MIN_VALUE, mw = Integer.MIN_VALUE;
		int i1 = -1, i2 = -1;
		for(int i=0; i<n; i++) {
			int h = a[i*2], w = a[i*2+1];
			if(mh<h) {
				mh = h;
				i1 = i+1;
			}
			if(mw<w) {
				mw = w;
				i2 = i+1;
			}
		}
		System.out.println(i1+" "+i2);
	}
}















