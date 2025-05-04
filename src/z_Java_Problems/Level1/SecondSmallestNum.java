package z_Java_Problems.Level1;

import java.util.*;
public class SecondSmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b && a<c){
            if(b<c) System.out.println(b+" is second smallest");
            else System.out.println(c+" is second smallest");
        }
        else if(b<a && b<c){
            if(a<c) System.out.println(a+" is second smallest");
            else System.out.println(c+" is second smallest");
        }
        else{
            if(a<b) System.out.println(a+" is second smallest");
            else System.out.println(b+" is second smallest");
        }
        sc.close();
    }
}