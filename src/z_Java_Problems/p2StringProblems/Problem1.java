package z_Java_Problems.p2StringProblems;

// Count words in a string
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		System.out.println("No. of words: "+arr.length);
		sc.close();
	}
}
