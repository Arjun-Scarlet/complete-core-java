package f_stringConcepts;
// Counting words without using String functions/methods
// useDelimiter() is non-static method in Scanner class
// It is used to split the input which is stored inside Scanner class reference

import java.util.Scanner;

public class Delimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Scanner s = new Scanner(str);
		s.useDelimiter(" ");//splits based on the given input
		int cnt = 0;
		while(s.hasNext()) {
			cnt++;
			s.next();
		}
		System.out.println("Word count: "+cnt);
		sc.close();
		s.close();
	}
}

