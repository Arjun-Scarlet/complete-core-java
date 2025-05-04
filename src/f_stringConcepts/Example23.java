package f_stringConcepts;

//Change the case of the character in a string

import java.util.*;
public class Example23 {
 static char caseConvert(char ch){
     if(ch>='A' && ch<='Z') return (char)(ch+32);
     if(ch>='a' && ch<='z') return (char)(ch-32);
     return ch;
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.nextLine();
     char[] arr = s1.toCharArray();
     
     String res = "";
     for(int i=0; i<arr.length; i++){
         res+=caseConvert(arr[i]);
     }
     System.out.println(res);
     sc.close();
 }
}
