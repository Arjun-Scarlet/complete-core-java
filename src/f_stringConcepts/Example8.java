package f_stringConcepts;

//Palindrome substrings
import java.util.*;
public class Example8 {
 static boolean isPalindrome(String s, int start, int end){
     int i = start, j = end;
     while(i<j){
         if(s.charAt(i)!=s.charAt(j)) return false;
         i++;
         j--;
     }
     return true;
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next();
     System.out.println("Palindrome substrings of "+s1+":");
     for(int i=0; i<s1.length()-1; i++){
         for(int j=i+1; j<s1.length(); j++){
             if(isPalindrome(s1,i,j)) System.out.println(s1.substring(i, j+1));
         }
     }
     sc.close();
 }
}
