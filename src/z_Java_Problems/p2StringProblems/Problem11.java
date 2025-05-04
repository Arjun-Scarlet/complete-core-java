package z_Java_Problems.p2StringProblems;

// Check whether the sentence is palindrome or not
import java.util.Scanner;

public class Problem11 {
	
	static boolean isPal(String s) {
		String[] a = s.split(" ");
		int i = 0, j = a.length-1;
		while(i<j) {
			if(a[i].compareTo(a[j])!=0) return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(isPal(s)) System.out.println("The sentence is Palindrome");
		else System.out.println("The sentence is not a Palindrome");
		sc.close();
	}
}
