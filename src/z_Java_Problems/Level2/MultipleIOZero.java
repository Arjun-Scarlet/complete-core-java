package z_Java_Problems.Level2;

import java.util.*;
public class MultipleIOZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsum = 0;
        int posEven = 0;
        int posOdd = 0;
        while (n!=0) {
            if(n<0)
            nsum+=n;
            if(n>0 && n%2==0)
            posEven+=n;
            if(n>0 && n%2!=0)
            posOdd+=n;
            n = sc.nextInt();
        }
        System.out.println("Negative Sum => "+nsum);
        System.out.println("Positive Even Sum => "+posEven);
        System.out.println("Positive Odd Sum => "+posOdd);
        sc.close();
    }
}
