package z_Java_Problems.Level4;

import java.util.*;
public class ArmstrongMethod{
    static int x = 1;
    public static int count(int n){
        int cnt = 0;
        while(n>0){cnt++;n/=10;}
        return cnt;
    }
    public static int power(int base, int pow){
        int prod = 1;
        for(int i=1; i<=pow; i++){prod*=base;}
        return prod;
    }
    public static boolean isArmstrong(int n){
        if(n<10) return true;
        int temp = n, arm = 0;
        int pow = count(temp);
        while(temp>0){
            arm+=power(temp%10, pow);
            temp/=10;
        }
        return arm==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        System.out.println("Armstrong Numbers:");
        for(int i=a; i<=b; i++){
            if(isArmstrong(i)) System.out.println(i);
        }
        sc.close();
        
    }
}