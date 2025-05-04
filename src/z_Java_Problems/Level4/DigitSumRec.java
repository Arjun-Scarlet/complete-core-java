package z_Java_Problems.Level4;

import java.util.*;
public class DigitSumRec{
    static int digitSum(int n){
        if(n<10) return n;
        return n%10 + digitSum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = digitSum(n);
        System.out.println("Sum of digit of a number => "+res);
        sc.close();
    }
}