package h_arrayConcepts;

// Numbers to Words conversion
import java.util.Scanner;

public class Example18 {

	static void convert(int n, String s) {
		String[] a = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] b = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		if(n!=0) {
			if(n<20) System.out.print(a[n]);
			else System.out.print(b[n/10]+" "+a[n%10]);
			System.out.print(s);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int[] num = {10000000, 100000, 1000, 100, 1};
		String[] word = {" Crore ", " Lakh ", " Thousand ", " Hundred and ", ""};

		if(n==0) System.out.println("Zero");
		else {
			for(int i=0; i<num.length; i++) {
				convert(n/num[i]%100, word[i]);
			}
		}
		sc.close();
	}
}
