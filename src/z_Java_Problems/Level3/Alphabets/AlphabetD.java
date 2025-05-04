package z_Java_Problems.Level3.Alphabets;

import java.util.*;
public class AlphabetD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
		    for(int j=1; j<=n; j++){
		        if(i==1 || j==2 || i==n || j==n)
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    System.out.println();
		}
        sc.close();
	}
}