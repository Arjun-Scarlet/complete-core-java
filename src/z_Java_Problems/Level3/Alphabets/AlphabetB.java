package z_Java_Problems.Level3.Alphabets;

import java.util.*;
public class AlphabetB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) n+=1;
		for(int i=1; i<=n; i++){
		    for(int j=1; j<=n; j++){
		        if(i==1 || j==2 || i==n || (i==n/2+1 && j!=1) || j==n)
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    System.out.println();
		}
        sc.close();
	}
}