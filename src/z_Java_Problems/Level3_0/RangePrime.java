package z_Java_Problems.Level3_0;

import java.util.*;
public class RangePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Prime Numbers:");
        for(int i=a; i<=b; i++){
            if(i<=1) continue;
            int cnt = 1;
            for(int j=2; j<i/2; j++){
                if(i%j==0){cnt = 0;}
            }
            if(cnt==1) System.out.print(i+" ");
        }
        sc.close();
    }
}
