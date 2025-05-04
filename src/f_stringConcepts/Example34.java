package f_stringConcepts;

/* String Permutation:
Input: abc
Output: abc, bac, cba, acb, bca, cab
*/

import java.util.*;
public class Example34 {
 static String swap(String s, int i, int j){
     char[] arr = s.toCharArray();
     char temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
     return new String(arr);
 }
 static void loopCall(String s, int start, int end){
     if(start==end){
         System.out.println(s);
         return;
     }
     for(int i=start; i<=end; i++){
         String s1 = swap(s, start, i);
         loopCall(s1, start+1, end);
     }
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     loopCall(str, 0, str.length()-1);
     sc.close();
 }
}
