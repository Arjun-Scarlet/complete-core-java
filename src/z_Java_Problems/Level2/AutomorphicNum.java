package z_Java_Problems.Level2;

import java.util.*;
public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, digit = 1;
        while(temp>0){
            digit*=10;
            temp/=10;
        }
        int sq = n*n;
        if((sq%digit)==n) System.out.println("Automorphic Number");
        else System.out.println("Not an Automorphic Number");
        sc.close();
    }
}
