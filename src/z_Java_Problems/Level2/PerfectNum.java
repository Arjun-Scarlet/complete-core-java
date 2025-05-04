package z_Java_Problems.Level2;

import java.util.*;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int perfect = 0;
        for(int i=1; i<n; i++){
            if(n%i==0)
            perfect+=i;
        }
        if(perfect==n) System.out.println("Perfect Number");
        else System.out.println("Not a Perfect Number");
        sc.close();
    }
}
