package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class Pyramid1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
            star+=2;
        }        
        sc.close();
    }
}
