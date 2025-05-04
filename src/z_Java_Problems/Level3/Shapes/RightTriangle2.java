package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class RightTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int temp = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=temp; j++){        //without temp => for(int j=i; j<=n; j++)
                System.out.print("* ");
            }
            System.out.println();
            temp--;
        }
        sc.close();
    }
}