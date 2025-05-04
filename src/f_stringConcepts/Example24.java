package f_stringConcepts;

//Change the case of the character in a string using split()

import java.util.*;
public class Example24 {
 static String caseConvert(String s){
     char[] a = s.toCharArray();
     String res="";
     for(char ch: a){
         if(ch>='A' && ch<='Z') res+=(char)(ch+32);
         else if(ch>='a' && ch<='z') res+=(char)(ch-32);
         else res+=ch;
     }
     return res;
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.nextLine();
     String[] arr = s1.split(" ");
     String res=caseConvert(arr[0]);
     for(int i=1; i<arr.length; i++){
         res+=" "+caseConvert(arr[i]);
     }
     System.out.println(res);
     sc.close();
 }
}
