package f_stringConcepts;

//Count consecutive repeated characters in a String and place the count with its respective character
//Input: success --> Output: su2ce2s
import java.util.*;
public class Example13 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     char[] arr = str.toCharArray();
     int i = 0;
     String res = "";
     while(i<arr.length){
         char ch = arr[i];
         i++;
         int cnt = 1;
         while(i<arr.length && ch==arr[i]){
             cnt++;
             i++;
         }
         if(cnt==1) res+=ch;     
         else res = res+cnt+ch;
         /*
         (or)
         res = res+cnt+ch; --> count a character and place the count before its respective character
         */
     }
     System.out.println("Original string: "+str);
     System.out.println("Modified string: "+res);
     sc.close();
 }
}
