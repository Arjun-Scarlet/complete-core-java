package z_Java_Problems.Level3_0;

import java.util.*;
public class RangeAutomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Automorphic Numbers:");
        for(int i=a; i<=b; i++){
            int temp = i, digit = 1;
            while(temp>0){digit*=10; temp/=10;}
            temp = i;
            int sq = i*i;
            if((sq%digit)==i) System.out.print(i+" ");
        }
        sc.close();
    }
}
