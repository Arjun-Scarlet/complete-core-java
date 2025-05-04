package f_stringConcepts;

//Remove all numbers in alpha-numeric string without using replace()

import java.util.*;
public class Example18 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next(); //1a2b3c4de
     char[] arr = s1.toCharArray();
     String res = "";
     int i = 0;
     while(i<arr.length){
         if(!(arr[i]>='0' && arr[i]<='9')) res+=arr[i];
         i++;
     }
     System.out.println(res);
     sc.close();
 }
}
