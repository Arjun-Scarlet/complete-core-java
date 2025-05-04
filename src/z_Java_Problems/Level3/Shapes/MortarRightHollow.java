package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class MortarRightHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = n*2-1, space = 0, star = n;
        for(int i=1; i<=total; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                if(i==1 || i==total || j==1 || j==star)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
            if(i<n){
                space++;
                star--;
            }
            else{
                space--;
                star++;
            }
        }
        sc.close();
    }
}
