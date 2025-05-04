package f_stringConcepts;

//Input: "Java is a lang", Output: "avaJ si a gnal" without in-built function

import java.util.*;
public class Example26 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     char[] arr = str.toCharArray();
     String res = "";
     int i = 0, j = 0;
     while(i<arr.length){
         while(j<arr.length && arr[j]!=' ') j++;

         String temp = "";
         for(int k=j-1; k>=i; k--){
             temp+=arr[k];
         }
         res+=temp;
         if(j<arr.length) res+=" ";
         j++;
         i=j;
     }
     System.out.println(res);
     sc.close();
 }
}
