package z_Java_Problems.p2StringProblems;

// Convert String into character array without using built-in function
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//finding length without using length()
		s += "\0";
		int len = 0;
		while(s.charAt(len)!='\0') {
			len++;
		}
		
		char[] arr = new char[len];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
