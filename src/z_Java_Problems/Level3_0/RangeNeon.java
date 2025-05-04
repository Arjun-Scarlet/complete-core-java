package z_Java_Problems.Level3_0;

import java.util.*;
public class RangeNeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Spy Numbers:");
        for(int i=a; i<=b; i++){
            int sq = i*i, sum = 0;
            while(sq>0){
                sum+=sq%10;
                sq/=10;
            }
            if(i==sum) System.out.print(i+" ");
        }
        sc.close();
    }
}
