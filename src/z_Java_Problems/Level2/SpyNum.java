package z_Java_Problems.Level2;

import java.util.*;
public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0, prod = 1;
        while(temp>0){
            int rem = temp%10;
            sum+=rem;
            prod*=rem;
            temp/=10;
        }
        if(sum==prod) System.out.println("Spy Number");
        else System.out.println("Not a Spy Number");
        sc.close();
    }
}