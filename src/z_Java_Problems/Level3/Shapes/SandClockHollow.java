package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class SandClockHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) n+=1;
        int space = 0, star = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                if(i==1 || i==n || j==1 || j==star)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
            if(i<=n/2){
                star-=2;
                space++;
            }
            else{
                star+=2;
                space--;
            }
        }
        sc.close();
    }
}
