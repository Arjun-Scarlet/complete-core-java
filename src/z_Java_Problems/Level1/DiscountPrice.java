package z_Java_Problems.Level1;

import java.util.*;
public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int discount = sc.nextInt();
        double amt = price*discount/100;
        System.out.println("Discount Price => Rs."+amt);
        sc.close();
    }
}