package g_regularExpression;

// Password is valid or not
import java.util.*;
import java.util.regex.*;
public class Example13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the password: ");
		String str = sc.next();
		String regex = "(?=.*[A-Z])(?=.*[!@#$%^&*_+-])(?=.*[0-9]).{9,14}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		if(m.matches()) System.out.println("Password valid!");
		else System.out.println("Password invalid!");
		sc.close();
		// (?=.*[input])--> used to give a condition
		//              --> true if the given input is anywhere in the string
	}

}
