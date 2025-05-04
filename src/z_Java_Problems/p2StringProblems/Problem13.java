package z_Java_Problems.p2StringProblems;

/*
String Encryption:
Input: S = “aaaaaaaaaaa”
Output: ba
Explanation:
First convert the given string to “a11” i.e. write, character along with its frequency.
Then, change “a11” to “ab” because 11 is b in hexadecimal.
Then, finally reverse the string i.e “ba”.

Input: S = “abc”
Output: 1c1b1a
*/
import java.util.*;
import java.util.regex.*;

public class Problem13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Pattern p = Pattern.compile("([a-zA-Z])\\1*");
		Matcher m = p.matcher(s);
		String res = "";
		while(m.find()) {
			String temp = m.group();
			if(temp.length()>9) {
				String len = Integer.toHexString(temp.length()).toUpperCase();
				res = len+""+temp.charAt(0)+res;
			}
			else res = temp.length()+""+temp.charAt(0)+res;
		}
		System.out.println(res);
		sc.close();
	}
}
