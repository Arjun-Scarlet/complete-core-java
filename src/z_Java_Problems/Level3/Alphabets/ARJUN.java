package z_Java_Problems.Level3.Alphabets;

import java.util.*;
public class ARJUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n/2+1 || j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n/2+1 || (j==n && i<=n/2) || (i>n/2 && i==j))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==n/2+1 || (i==n && j<=n/2) || (j==1 && i>n/2+1))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i==n || j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i==j || j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
