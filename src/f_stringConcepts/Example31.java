package f_stringConcepts;

/* Decoding 1: (lowercase string characters[single word])
Input: neze 4
Output: java
neze-->decoded string, 4-->level of decoding, java-->original string
*/ 

import java.util.*;
public class Example31 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter decoded string:");
     String str = sc.next();
     System.out.println("Enter decode level:");
     int level = sc.nextInt();

     char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
     char[] arr = str.toCharArray();
     for(int i=0; i<arr.length; i++){
         char ch = arr[i];
         int index = ch-97;
         index = (index-level+26)%26;
         arr[i] = alpha[index];
     }
     String res = new String(arr);
     System.out.println("Decoded string: "+str);
     System.out.println("Original string: "+res);
     sc.close();
 }
}
