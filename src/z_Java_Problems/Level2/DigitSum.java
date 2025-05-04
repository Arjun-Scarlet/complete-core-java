package z_Java_Problems.Level2;

import java.util.*;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (temp>0) {
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of Digits => "+sum);
        sc.close();
    }
}
