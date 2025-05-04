package z_Java_Problems.Level1;

import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.print("Factorial of "+n+" => "+fact);
        sc.close();
    }
}