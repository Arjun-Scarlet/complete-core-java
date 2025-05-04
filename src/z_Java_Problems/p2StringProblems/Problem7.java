package z_Java_Problems.p2StringProblems;
/*
Input: Saiyan
Output:
S
S a
S a i
S a i y
S a i y a
S a i y a n
*/
import java.util.*;
public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
