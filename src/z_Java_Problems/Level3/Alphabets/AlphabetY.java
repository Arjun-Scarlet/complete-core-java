package z_Java_Problems.Level3.Alphabets;

import java.util.*;
public class AlphabetY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) n+=1;
		for(int i=1; i<=n; i++){
		    for(int j=1; j<=n; j++){
		        if((i==j || i+j==n+1) && i<=n/2+1 || (j==n/2+1 && i>n/2))
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    System.out.println();
		}
        sc.close();
	}
}