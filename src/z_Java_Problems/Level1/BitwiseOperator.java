package z_Java_Problems.Level1;

import java.util.*;
public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int and = a&b;
        int or = a|b;
        int xor = a^b;
        System.out.println("Bitwise AND => "+and);
        System.out.println("Bitwise OR => "+or);
        System.out.println("Bitwise XOR => "+xor);
        System.out.println("Bitwise NOT => "+~a+", "+~b);
        System.out.println("Bitwise Left Shift => "+(a<<1));
        System.out.println("Bitwise Right Shift => "+(a>>1));
        sc.close();
    }
}
