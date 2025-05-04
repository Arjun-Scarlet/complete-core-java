package z_Java_Problems.Level1;

import java.util.*;
public class CountEvenDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("Even Days => "+31/2); break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("Even Days => "+30/2); break;
            case 2:
            System.out.println("Even Days => "+28/2); break;
            default:
            System.out.println("Enter less than 12");
        }
        sc.close();
    }
}
