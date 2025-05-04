	package z_Java_Problems.p2StringProblems;

// Print unique characters in a String method-1
import java.util.*;
public class Problem8_0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] a = s.toCharArray();
		boolean[] exist = new boolean[a.length];
		int cnt = 0;
		for(int i=0; i<a.length; i++) {
			if(!exist[i]) {
				cnt++;
				for(int j=i+1; j<a.length; j++) {
					if(a[i]==a[j]) exist[j] = true;
				}
			}
		}
		char[] arr = new char[cnt];
		int index = 0;
		for(int i=0; i<a.length; i++) {
			if(!exist[i]) arr[index++] = a[i];
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
