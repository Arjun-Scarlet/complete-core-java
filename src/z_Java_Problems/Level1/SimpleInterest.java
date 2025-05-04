package z_Java_Problems.Level1;

import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        double t = sc.nextDouble();
        int r = sc.nextInt();
        double SI = p*t*r/100;
        System.out.println(SI);
        sc.close();
    }
}
