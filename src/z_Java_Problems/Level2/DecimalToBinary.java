package z_Java_Problems.Level2;

import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int temp = decimal;
        int binary = 0, i = 1;
        while(temp>0){
            int rem = temp%2;
            binary = binary+rem*i;
            temp/=2;
            i*=10;
        }
        System.out.println("Binary value of "+decimal+" => "+binary);
        sc.close();
    }
}