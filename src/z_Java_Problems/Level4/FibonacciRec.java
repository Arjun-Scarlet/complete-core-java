package z_Java_Problems.Level4;

import java.util.*;
public class FibonacciRec{
    static void display(int n){
        fib(0,1,1,n);
    }
    static void fib(int a, int b, int cnt, int n){
        if(cnt>n) return;
        System.out.print(a+" ");
        fib(b,a+b,cnt+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        display(n);
        sc.close();
    }
}