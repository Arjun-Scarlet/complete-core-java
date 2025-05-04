package z_Java_Problems.Level1;

import java.util.*;
public class RsToUsd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rs = sc.nextInt();
        float usd = rs/83.60f;
        System.out.println("Rs."+rs+" is "+usd+" in USD");
        sc.close();
    }
}