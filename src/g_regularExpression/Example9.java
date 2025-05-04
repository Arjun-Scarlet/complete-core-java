package g_regularExpression;

// Given input contains 3 digits or not
import java.util.regex.*;
import java.util.Scanner;
public class Example9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 digit number: ");
		String n = sc.next();
		Pattern p = Pattern.compile("[0-9]{3}");
		Matcher m = p.matcher(n);
		if(m.matches()) System.out.println("Input valid!");
		else System.out.println("Input invalid!");
		sc.close();
		//matches()--> checks entire string with the pattern expression
	}
}