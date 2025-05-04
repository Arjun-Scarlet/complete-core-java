package g_regularExpression;

import java.util.regex.*;
public class Example6 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a.b");
		Matcher m = p.matcher("a1babbba+");
		System.out.println("For a.b:");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("--------");
		
		System.out.println("For [abc]:");
		p = Pattern.compile("[abc]");
		m = p.matcher("a1babbba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("--------");
		
		System.out.println("For [0-9]:");
		p = Pattern.compile("[0-9]");
		m = p.matcher("a1babbba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("--------");
		
		System.out.println("For a[0-9]:");
		p = Pattern.compile("a[0-9]");
		m = p.matcher("a1babbba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("--------");
		
		System.out.println("For a[abc]:");
		p = Pattern.compile("a[abc]");
		m = p.matcher("a1babbba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("--------");
		
		System.out.println("For a[a-z]");
		p = Pattern.compile("a[a-z]");
		m = p.matcher("a1babbba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("--------");
		
		System.out.println("For a[a-zA-Z]");
		p = Pattern.compile("a[a-zA-Z]");
		m = p.matcher("a1babbba+");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}