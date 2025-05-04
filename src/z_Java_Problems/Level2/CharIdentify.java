package z_Java_Problems.Level2;

import java.util.*;
public class CharIdentify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int ch;
        int vow = 0, cons = 0, wh = 0, sbl = 0 ;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            vow++;
            else if(ch>='a' && ch<='z')
            cons++;
            else if(ch==' ')
            wh++;
            else
            sbl++;
        }
        System.out.println("Vowels => "+vow);
        System.out.println("Consonants => "+cons);
        System.out.println("White Spaces => "+wh);
        System.out.println("Symbols or Numbers => "+sbl);
        sc.close();
    }
}
