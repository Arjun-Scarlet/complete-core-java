package z_Java_Problems.Level2;

import java.util.*;
public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, octal = 0, i = 1;
        while(temp>0){
            int rem = temp%10;
            octal+=rem*i;
            temp/=10;
            i*=8;
        }
        System.out.println("Octal value of "+n+" => "+octal);
        sc.close();
    }
}