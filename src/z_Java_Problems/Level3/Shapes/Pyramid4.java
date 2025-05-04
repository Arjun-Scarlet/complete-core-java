package z_Java_Problems.Level3.Shapes;

import java.util.*;
public class Pyramid4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) n+=1;
        int star = 1, space = n/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<=n/2){
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
