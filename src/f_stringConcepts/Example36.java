package f_stringConcepts;

// Print no. of lowercase characters in a string
import java.util.Scanner;
public class Example36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String s = sc.next();
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') count++;
		}
		if(count==0) System.out.println("No lowercase character present!");
		else System.out.println(count);
		sc.close();
	}

}
