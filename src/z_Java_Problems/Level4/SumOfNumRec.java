package z_Java_Problems.Level4;

import java.util.*;
public class SumOfNumRec{
    static int sum(int n){
        if(n==1) return n;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println("Sum of n numbers => "+res);
        sc.close();
    }
}