package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class Pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n*2-1, space = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
            space++;
            star-=2;
        }
        sc.close();
    }
}
