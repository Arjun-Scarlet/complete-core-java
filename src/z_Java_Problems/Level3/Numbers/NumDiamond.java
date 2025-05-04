package z_Java_Problems.Level3.Numbers;

import java.util.*;
public class NumDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) n+=1;
        int space = n/2, star = 1;
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
            if(i<=n/2){space--; star+=2;}
            else{space++; star-=2;}
        }
        sc.close();
    }
}
