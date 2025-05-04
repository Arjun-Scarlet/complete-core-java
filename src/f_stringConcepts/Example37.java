package f_stringConcepts;

// Sorting characters in a string
import java.util.Scanner;
public class Example37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length-1; i++) {
			for(int j=0; j<ch.length-1-i; j++) {
				if(ch[j+1]<ch[j]) {
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		String res = new String(ch);
		System.out.println(res);
		sc.close();
	}
}
