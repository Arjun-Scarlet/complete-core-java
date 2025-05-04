package z_Java_Problems.p2StringProblems;

// Occurance of the character in a string
import java.util.*;
public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		while(s.length()>0) {
			char ch = s.charAt(0);
			String temp = s.replace(ch+"", "");
			int cnt = s.length()-temp.length();
			System.out.println(ch+"="+cnt);
			s = temp;
		}
		sc.close();
	}
}
