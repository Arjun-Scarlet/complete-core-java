package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class RightTriangle2Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=temp; j++){
                if(i==1 || j==1 || i+j==n+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
            temp--;
        }
        sc.close();
    }
}