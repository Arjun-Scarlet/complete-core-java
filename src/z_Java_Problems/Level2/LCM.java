package z_Java_Problems.Level2;

import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lcm = 0, max = n>m ? n : m;
        for(int i=max; i<n*m; i++){
            if(i%n==0 && i%m==0){
                lcm = i;
                break;
            }
        }
        System.out.println("LCM of "+n+", "+m+" => "+lcm);
        sc.close();
    }
}
