package z_Java_Problems.p2StringProblems;

// Sort the given string
import java.util.*;

public class Problem12 {

	static String sort(char[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return new String(a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] a = s.toCharArray();
		s = sort(a);
		System.out.println(s);
		sc.close();
	}
}
