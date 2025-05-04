package z_Java_Problems.Level1;

import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        long res = 1;
        for(int i=1; i<=pow; i++){
            res*=num;
        }
        System.out.println(res);
        sc.close();
    }
}