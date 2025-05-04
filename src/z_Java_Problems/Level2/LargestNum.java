package z_Java_Problems.Level2;

import java.util.*;
public class LargestNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>n2)
        System.out.println("Largest=>"+n1);
        else
        System.out.println("Largest=>"+n2);
        sc.close();
    }
}