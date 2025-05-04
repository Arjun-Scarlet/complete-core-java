package f_stringConcepts;

/*
GCD in String:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: "" 

*/
import java.util.Scanner;
public class Example39 {
	static String gcd(String s1, String s2) {
		if(s1.length()<s2.length()) return gcd(s2, s1);
		else if(!s1.startsWith(s2)) return "";
		else if(s2.length()==0) return s1;
		else return gcd(s1.substring(s2.length()),s2);
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s1 = sc.next();
			String s2 = sc.next();
			System.out.println(gcd(s1,s2));
		}
	}
}
