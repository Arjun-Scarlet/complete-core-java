package z_Java_Problems.p2StringProblems;

// Input: Malayalam, Output: M@l@y@l@m
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print("Enter what you need to change: ");
		char c1 = sc.next().charAt(0);
		System.out.print("Enter the change: ");
		char c2 = sc.next().charAt(0);
		char[] a = s.toCharArray();
		for(int i=0; i<a.length; i++) {
			if(c1==a[i]) a[i] = c2;
		}
		s = new String(a);
		System.out.println(s);
		sc.close();
	}
}
