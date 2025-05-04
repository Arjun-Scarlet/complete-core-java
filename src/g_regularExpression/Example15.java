package g_regularExpression;

// Back referencing
import java.util.regex.*;
public class Example15 {

	public static void main(String[] args) {
		String str = "a11aabb77ccc23d";
		Pattern p = Pattern.compile("([a-z])\\1");
		Matcher m = p.matcher(str);
		System.out.println("For ([a-z])\\\\1: ");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("------------");
		
		System.out.println("For ([a-z])([0-9])\\\\2: ");
		p = Pattern.compile("([a-z])([0-9])\\2");
		m = p.matcher(str);
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		//([exp1])([exp2])...\\num --> last substring/character same as num group
		//([exp1])([exp2])...\\1 --> last substring/character same as 1st group
		//([exp1])([exp2])...\\2 --> last substring/character same as 2nd group
	}

}
