package f_stringConcepts;

//Input: "Java is a lang", Output: "lang a is Java" with in-built function

import java.util.*;
public class Example28 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     char[] arr = str.toCharArray();
     String res = "";
     int i = 0, j = 0;
     while(i<arr.length){
         while(j<arr.length && arr[j]!=' ') j++;

         String temp = "";
         for(int k=i; k<=j-1; k++){
             temp += arr[k];
         }
         res = temp+res;
         if(j<arr.length) res=" "+res;
         j++;
         i = j;
     }
     System.out.println(res);
     sc.close();
 }
}
