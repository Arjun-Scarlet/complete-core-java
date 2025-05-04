package z_Java_Problems.Level3.Numbers;

import java.util.*;
public class AlphaNumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1, star = 1;
        int num = 1; char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                if(i==n || j==1 || j==star){
                System.out.print(ch+" ");
                ch++;
                }
                else{
                System.out.print(num+" ");
                num++;
                }
            }
            System.out.println();
            space--;
            star+=2;
        }
        sc.close();
    }
}
