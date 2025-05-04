package g_regularExpression;

import java.util.regex.*;
public class Example5 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a.b");
		Matcher m = p.matcher("a1babbba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("--------");
		p = Pattern.compile("a...b");
		m = p.matcher("a1babbba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}