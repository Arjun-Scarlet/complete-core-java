package f_stringConcepts;

//Remove all numbers in alpha-numeric string using replace()

import java.util.*;
public class Example19 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next(); //1a2b3c4de
     char[] arr = s1.toCharArray();
     int i = 0;
     while(i<arr.length){
         char ch = arr[i];
         String temp = "";
         if(ch>='0' && ch<='9'){
             temp = s1.replace(ch+"","");
             s1 = temp;
         }
         i++;
     }
     System.out.println(s1);
     sc.close();
 }
}
