package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class MortarLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = n*2-1, star = n;
        for(int i=1; i<=total; i++){
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<n)
            star--;
            else
            star++;
        }
        sc.close();
    }
}
