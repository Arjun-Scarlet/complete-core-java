package f_stringConcepts;

//Count each character occurrence in a string using replace()

import java.util.*;
public class Example17 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.nextLine();
     String del = "";
     while(s1.length()>0){
         char ch = s1.charAt(0);
         del = s1.replace(ch+"", "");
         int cnt = s1.length() - del.length();
         System.out.println(ch+" occurance: "+cnt);
         s1 = del;
     }
     sc.close();
 }
}
