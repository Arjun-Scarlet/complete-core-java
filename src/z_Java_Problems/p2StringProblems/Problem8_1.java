package z_Java_Problems.p2StringProblems;

//Print unique characters in a String method-2
import java.util.Scanner;

public class Problem8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Unique Characters: ");
		while(s.length()>0) {
			char ch = s.charAt(0);
			String temp = s.replace(ch+"", "");
			int cnt = s.length()-temp.length();
			if(cnt==1) System.out.print(ch+" ");
			s = temp;
		}
		sc.close();
	}
}
