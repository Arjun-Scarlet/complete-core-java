package f_stringConcepts;

//Input: "Java is a lang", Output: "avaJ si a gnal" with in-built function

import java.util.*;
public class Example25 {
 static String reverse(String s){
     String ans = "";
     for(int i=s.length()-1; i>=0; i--){
         char ch = s.charAt(i);
         ans+=ch;
     }
     return ans;
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     String[] arr = str.split(" ");
     String res = reverse(arr[0]);
     for(int i=1; i<arr.length; i++){
         res+=" "+reverse(arr[i]);
     }
     System.out.println(res);
     sc.close();
 }
}
