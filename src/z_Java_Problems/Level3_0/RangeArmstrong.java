package z_Java_Problems.Level3_0;

import java.util.*;
public class RangeArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Armstrong Numbers:");
        for(int i=n; i<=m; i++){
            int temp = i, sum = 0;
            int cnt = (int)Math.log10(i)+1;
            while(temp>0){
                int rem = temp%10;
                sum+=(int)Math.pow(rem, cnt);
                temp/=10;
            }
            if(i==sum) System.out.print(i+" ");
        }
        sc.close();
    }
}
