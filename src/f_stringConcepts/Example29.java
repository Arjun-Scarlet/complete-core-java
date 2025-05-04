package f_stringConcepts;

/* Encoding 1: (lowercase string characters[single word])
Input: java 4
Output: neze
java-->original string, 4-->level of encoding, neze-->encoded string
*/ 

import java.util.*;
public class Example29 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string:");
     String str = sc.nextLine();
     System.out.println("Enter encode level:");
     int level = sc.nextInt();

     char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
     char[] arr = str.toCharArray();
     for(int i=0; i<arr.length; i++){
         char ch = arr[i];
         int index = ch-97;
         index = (index+level)%26;
         arr[i] = alpha[index];
     }
     String res = new String(arr);
     System.out.println("Original string: "+str);
     System.out.println("Encoded string: "+res);
     sc.close();
 }
}
