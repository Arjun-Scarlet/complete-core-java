package z_Java_Problems.Level3.Alphabets;

import java.util.*;
public class AlphabetQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                //if((i==1 && j<n) || (j==1 && i<n) || (j==n-1 && i<n) || (i==n-1 && j<n) || (i==n && j==n))
                if((i==1 || i==n-1) && j<n || (j==1 || j==n-1) && i<n || (i==n && j==n))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
