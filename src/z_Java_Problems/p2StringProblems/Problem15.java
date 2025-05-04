package z_Java_Problems.p2StringProblems;

// Find Largest Substring palindrome in a string(only one output)
import java.util.Scanner;

public class Problem15 {
	
	static boolean isPal(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String res = "";
		int len = 0;
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<=s.length()-1; j++) {
				if(isPal(s,i,j)) {
					String temp = s.substring(i, j+1);
					if(len<temp.length()) {
						res = temp;
						len = temp.length();
					}
				}
			}
		}
		System.out.println(res);
		sc.close();
	}
}
