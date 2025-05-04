package z_Java_Problems.Level3_0;

import java.util.*;
public class RangeSpy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Spy Numbers:");
        for(int i=a; i<=b; i++){
            int temp = i, sum = 0, prod = 1;
            while(temp>0){
                sum+=temp%10;
                prod*=temp%10;
                temp/=10;
            }
            if(sum==prod) System.out.print(i+" ");
        }
        sc.close();
    }
}
