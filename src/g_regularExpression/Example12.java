package g_regularExpression;

// Sum of numbers in a string 
import java.util.*;
import java.util.regex.*;
public class Example12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		String regex = "[0-9]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		int sum = 0;
		while(m.find()) {
			sum+=Integer.parseInt(m.group());
		}
		System.out.println("Sum of numbers in a string: "+sum);
		sc.close();
	}

}
