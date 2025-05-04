package z_Java_Problems.Level3.Numbers;

import java.util.*;
public class NumSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 1;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                for(int j=1; j<=n; j++){
                    System.out.print(num1++ +" ");
                }
            }
            else{
                int num2 = num1+n-1;
                for(int j=1; j<=n; j++){
                    System.out.print(num2-- +" ");
                }
                num1 += n;
            }
            System.out.println();
            sc.close();
        }
    }
}
