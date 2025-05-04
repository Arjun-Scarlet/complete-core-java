package f_stringConcepts;

//String Palindrome
import java.util.*;
public class Example5 {
 static boolean isPalindrome(String s){
     String str = s.toLowerCase();
     int i = 0, j = s.length()-1;
     while(i<j){
         if(str.charAt(i)!=str.charAt(j)) return false;
         i++;
         j--;
     }
     return true;
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next();
     System.out.println(s1+" palindrome => "+isPalindrome(s1));
     sc.close();
 }
}
