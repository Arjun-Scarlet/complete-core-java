package z_Java_Problems.p2StringProblems;

// Find Smallest Substring palindrome in a string(only one output)
import java.util.Scanner;

public class Problem14 {
	
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
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<=s.length()-1; j++) {
				if(isPal(s,i,j)) {
					String temp = s.substring(i, j+1);
					if(temp.length()<s.length()) res = temp;
				}
			}
		}
		System.out.println(res);
		sc.close();
	}
}
