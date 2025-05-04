package z_Java_Problems.Level2;

import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        if(n<=1) System.out.println("Give number > 1");
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
            cnt = 0;
        }
        if(cnt==1) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");
        sc.close();
    }
}