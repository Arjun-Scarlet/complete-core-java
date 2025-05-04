package z_Java_Problems.Level2;

import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, cnt = 0, arm = 0;
        while(temp>0){cnt++;temp/=10;}
        temp = n;
        while(temp>0){
            int rem = temp%10;
            int pow = 1;
            for(int i=1; i<=cnt; i++){pow*=rem;}
            arm+=pow;
            temp/=10;
        }
        if(arm==n) System.out.println("Armstrong Number");
        else System.out.println("Not an Armstrong Number");
        sc.close();
    }
}
