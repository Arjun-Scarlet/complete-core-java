package z_Java_Problems.p2StringProblems;

// Count vowel characters in a string
import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			s = s.toLowerCase();
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				cnt++;
			}
		}
		System.out.println("Vowel count: "+cnt);
		sc.close();
	}
}
