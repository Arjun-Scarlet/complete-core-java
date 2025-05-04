package z_Java_Problems.p2StringProblems;

// Arrange the string in the order: numbers, special character and alphabets
// Input: hello@25, Output: 25@hello
import java.util.*;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "", s2 = "", s3 = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') s1 += ch;
			else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') s2 += ch;
			else s3 += ch;
		}
		s = s1+s3+s2;
		System.out.println(s);
		sc.close();
	}
}
