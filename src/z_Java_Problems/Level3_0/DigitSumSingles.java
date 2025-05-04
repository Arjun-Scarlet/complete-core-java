package z_Java_Problems.Level3_0;

import java.util.*;
public class DigitSumSingles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum+=rem;
            temp/=10;
            if(temp==0 && sum>9){
                temp = sum;
                sum = 0;
            }
        }
        System.out.println("Sum of digits till single digit => "+sum);
        sc.close();
    }
}
