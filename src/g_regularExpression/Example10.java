package g_regularExpression;

// Given mobile number is valid or not
import java.util.*;
import java.util.regex.*;
public class Example10 {
	static boolean numberCheck(String s) {
		String regex = "[6-9][0-9]{9}";
		return Pattern.compile(regex).matcher(s).matches();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Phn.no: ");
		String n = sc.next();
		if(numberCheck(n)) System.out.println("Valid Phone number!");
		else System.out.println("Invalid Phone number!");
		sc.close();
	}

}