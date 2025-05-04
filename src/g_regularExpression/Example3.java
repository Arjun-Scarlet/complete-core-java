package g_regularExpression;

// Matcher methods
import java.util.regex.*;
public class Example3 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".a");
		Matcher m = p.matcher("banana");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		// We can't able to print these methods directly
		// start()--> returns starting index of the pattern
		// end()--> returns ending index+1 of the pattern
		// group()--> returns substring that matches the pattern
	}

}
