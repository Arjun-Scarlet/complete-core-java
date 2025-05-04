package z_Java_Problems.Level3.Alphabets;

import java.util.*;
public class AlphabetG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || (j==n && i>n/2))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
