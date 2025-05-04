package g_regularExpression;

// Matching a string based on patterns called Regular Expression
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Example1 {
	public static void main(String[]args) {
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("java");
		// find()--> checks any substring matching with the pattern
		//       --> checks a character/substring only one time
		System.out.println(m.find());//true
		System.out.println(m.find());//true
		System.out.println(m.find());//false because it already checked both 'a' 
	}
}
