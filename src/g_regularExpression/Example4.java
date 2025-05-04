package g_regularExpression;

import java.util.regex.*;
public class Example4 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a.");
		Matcher m = p.matcher("a1aba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}
