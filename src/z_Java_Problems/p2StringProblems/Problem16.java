package z_Java_Problems.p2StringProblems;

// Find the missing numbers from a string in the range 0-9
import java.util.Arrays;

public class Problem16 {

	public static void main(String[] args) {
		String s = "a5bc0d6e8";//1, 2, 3, 4, 7, 9
		String num = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') num += ch;
		}
		char[] a = num.toCharArray();
		Arrays.sort(a);
		
		String n = "0123456789".replaceAll("["+new String(a)+"]", ""); //using regex
		char[] res = n.toCharArray();
		System.out.println(Arrays.toString(res));
	}
}
