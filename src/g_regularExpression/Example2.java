package g_regularExpression;

//Count number of occurrences using regex
import java.util.regex.*;
public class Example2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("na");
		Matcher m = p.matcher("banana");
		int cnt = 0;
		while(m.find()) {
			cnt++;
		}
		System.out.println(cnt);
	}

}
