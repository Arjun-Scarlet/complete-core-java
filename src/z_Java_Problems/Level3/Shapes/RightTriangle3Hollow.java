package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class RightTriangle3Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1, space = n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                if(i==n || j==1 || j==star)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
            star++;
            space--;
        }
        sc.close();
    }
}
