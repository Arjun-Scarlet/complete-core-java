package g_regularExpression;

// Quantifiers
import java.util.regex.*;
public class Example8 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab+");
		Matcher m = p.matcher("ab1b3abb2ba+");
		System.out.println("For ab+:"); // + --> matches one to many occurrences
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("---------");
		
		System.out.println("For a+b:");
		p = Pattern.compile("a+b");
		m = p.matcher("a1baababaaab");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("---------");
				
		System.out.println("For ba*:");
		p = Pattern.compile("ba*"); // * --> matches 0 to many occurrences
		m = p.matcher("a1baababaaab");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("---------");
		
		System.out.println("For ba?:");
		p = Pattern.compile("ba?"); // ? --> matches 0 or 1 occurrences
		m = p.matcher("a1baababaaab");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}