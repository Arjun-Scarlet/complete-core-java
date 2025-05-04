package f_stringConcepts;

//Encoding 2: ([characters with lowercase and uppercase] or whole sentence)

import java.util.*;
public class Example30 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string:");
     String str = sc.nextLine();
     System.out.println("Enter encode level:");
     int level = sc.nextInt();

     char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
     char[] alpha1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
     char[] arr = str.toCharArray();
     for(int i=0; i<arr.length; i++){
         char ch = arr[i];
         if(Character.isLowerCase(arr[i])){
             int index = ch-97;
             index = (index+level)%26;
             arr[i] = alpha[index];
         }
         else if(Character.isUpperCase(arr[i])){
             int index = ch-65;
             index = (index+level)%26;
             arr[i] = alpha1[index];
         }
         else arr[i] = ch;
     }
     String res = new String(arr);
     System.out.println("Original string: "+str);
     System.out.println("Encoded string: "+res);
     sc.close();
 }
}
