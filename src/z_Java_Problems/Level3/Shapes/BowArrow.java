package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class BowArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = n*2-1, space = total/2, star = 1;
        for(int i=1; i<=total; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                if(i==total/2+1 || j==1 || j==star)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
            if(i<n){
                space--;
                star++;
            }
            else{
                space++;
                star--;
            }
        }
        sc.close();
    }
}
