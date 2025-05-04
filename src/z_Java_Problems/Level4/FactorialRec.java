package z_Java_Problems.Level4;

import java.util.*;
public class FactorialRec{
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println("Factorial of a number => "+res);
        sc.close();
    }
}