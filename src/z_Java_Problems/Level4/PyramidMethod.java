package z_Java_Problems.Level4;

import java.util.*;
public class PyramidMethod{
    public static void spaces(int n){
        for(int i=1; i<=n; i++){
            System.out.print(" ");
        }
    }
    public static void stars(int n){
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for(int i=1; i<=n; i++){
            spaces(n-i);
            stars(2*i-1);
            System.out.println();
        }
        sc.close();
    }
}