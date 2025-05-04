package z_Java_Problems.Level1;

import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Average of n numbers => "+sum/n);
        sc.close();
    }
}
