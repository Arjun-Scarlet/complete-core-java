package e_oopsConcepts.Methods;

import java.util.*;
public class MethodTypes{
    // Method without datatypes and args 
    static void m1(){
        int a = 10, b = 5;
        System.out.println("Method without datatypes and args => "+(a+b));
    }
    // Method without datatypes and with args 
    static void m2(int a, int b){
        System.out.println("Method without datatypes, with args => "+(a-b));
    }
    // Method with datatypes and without args 
    static int m3(){
        int a = 10, b = 5;
        return a*b;
    }
    // Method with datatypes and args 
    static int m4(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1();
        m2(10,5);
        System.out.println("Method with datatypes, without args => "+m3());
        System.out.println("Method with datatypes and args => "+m4(10,5));
        sc.close();
    }
}