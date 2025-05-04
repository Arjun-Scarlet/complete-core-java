package g_regularExpression;

// Word Spell Code: Input:success, Output:1s1u2c1e2s
import java.util.*;
import java.util.regex.*;
public class Example16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		Pattern p = Pattern.compile("([a-z])\\1*");
		Matcher m = p.matcher(str);
		String res = "";
		while(m.find()) {
			String temp = m.group();
			res = res+temp.length()+temp.charAt(0);
		}
		System.out.println("Modified string: "+res);
		sc.close();
	}

}
