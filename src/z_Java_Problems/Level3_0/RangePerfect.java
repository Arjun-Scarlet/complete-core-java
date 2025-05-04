package z_Java_Problems.Level3_0;

import java.util.*;
public class RangePerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perfect Numbers:");
        for(int i=a; i<=b; i++){
            int perfect = 0;
            for(int j=1; j<i; j++){
                if(i%j==0){perfect+=j;}
            }
            if(i==perfect) System.out.print(i+" ");
        }
        sc.close();
    }
}
