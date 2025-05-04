package z_Java_Problems.p2StringProblems;

import java.util.Scanner;

// Palindrome words from a sentence of string
public class Problem6 {

	static boolean isPal(String s) {
		s = s.toLowerCase();
		int i = 0, j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();//Madam is from Kerala, and she speaks Malayalam
		String[] a = s.split(" ");
		String res = a[0];
		for(int i=1; i<a.length; i++) {
			if(isPal(a[i])) res += " "+a[i];
		}
		System.out.println(res);
		sc.close();
	}
}
