package z_Java_Problems.Level2;

import java.util.*;
public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, strong = 0;
        while(temp>0){
            int rem = temp%10;
            int fact = 1;
            for(int i=1; i<=rem; i++){fact*=i;}
            strong+=fact;
            temp/=10;
        }
        if(strong==n) System.out.println("Strong Number");
        else System.out.println("Not a Strong Number");
        sc.close();
    }
}
