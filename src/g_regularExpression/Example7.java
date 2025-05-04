package g_regularExpression;

// Quantifiers--> Used to match the pattern based on occurrences
import java.util.regex.*;
public class Example7 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("b{2}");
		Matcher m = p.matcher("a1b3abb2ba+");
		System.out.println("For b{2}:");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("---------");
		
		System.out.println("For a{2,4}:");
		p = Pattern.compile("a{2,4}");
		m = p.matcher("a1baabaaaaaad");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("---------");
		
		System.out.println("For [0-9]{3}:");
		p = Pattern.compile("[0-9]{3}");
		m = p.matcher("a1b34c578d1247");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}