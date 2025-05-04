package z_Java_Problems.Level1;

import java.util.*;
public class CurrencyCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if(amt>=2000){
            System.out.println(amt/2000+" 2000s");
            amt%=2000;
        }
        if(amt>=500){
            System.out.println(amt/500+" 500s");
            amt%=500;
        }
        if(amt>=200){
            System.out.println(amt/200+" 200s");
            amt%=200;
        }
        if(amt>=100){
            System.out.println(amt/100+" 100s");
            amt%=100;
        }
        if(amt>=50){
            System.out.println(amt/50+" 50s");
            amt%=50;
        }
        if(amt<50){
            System.out.println(amt+" changes");
        }
        sc.close();
    }
}
