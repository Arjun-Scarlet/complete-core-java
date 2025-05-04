package z_Java_Problems.Level2;

import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int decimal = 0, i = 1;
        while(temp>0){
            int rem = temp%10;
            decimal = decimal+rem*i;
            temp/=10;
            i*=2;
        }
        System.out.println("Decimal value of "+n+" => "+decimal);
        sc.close();
    }
}