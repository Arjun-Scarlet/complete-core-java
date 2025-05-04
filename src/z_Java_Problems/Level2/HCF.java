package z_Java_Problems.Level2;

import java.util.*;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int hcf = 0, min = n<m ? n : m;
        for(int i=1; i<=min/2; i++){
            if(n%i==0 && m%i==0){hcf = i;}
        }
        System.out.println("HCF of "+n+", "+m+" => "+hcf);
        sc.close();
    }
}
