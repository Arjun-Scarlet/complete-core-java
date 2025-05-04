package z_Java_Problems.Level3_0;

import java.util.*;
public class RangeStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Strong Numbers:");
        for(int i=a; i<=b; i++){
            int temp = i, strong = 0;
            while(temp>0){
                int rem = temp%10;
                int fact = 1;
                for(int j=1; j<=rem; j++){fact*=j;}
                strong+=fact;
                temp/=10;
            }
            if(i==strong) System.out.print(i+" ");
        }
        sc.close();
    }
}
