package z_Java_Problems.Level1;

import java.util.*;
public class Operator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>0 && n2>0){
            System.out.println(n1+n2);
            System.out.println(n1-n2);
            System.out.println(n1*n2);
            System.out.println(n1/n2);
        }
        sc.close();
    }
}