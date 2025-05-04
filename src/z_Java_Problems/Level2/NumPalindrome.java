package z_Java_Problems.Level2;

import java.util.*;
public class NumPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = (rev*10)+rem;
            temp/=10;
        }
        if(rev==n) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
        sc.close();
    }
}