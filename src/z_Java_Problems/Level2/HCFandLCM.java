package z_Java_Problems.Level2;

import java.util.*;
public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = (a<b)?a:b;
        int hcf = 0;
        for(int i=1; i<=min/2; i++){
            if(a%i==0 && b%i==0)
            hcf=i;
        }
        System.out.println("HCF of "+a+","+b+" => "+hcf);
        int lcm = a*b/hcf;
        System.out.println("LCM of "+a+","+b+" => "+lcm);
        sc.close();
    }
}