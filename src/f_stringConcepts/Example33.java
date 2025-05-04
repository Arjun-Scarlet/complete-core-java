package f_stringConcepts;

/* Anagram: (each characters in one string is equal to another string including length and occurance)
Input: silent listen, Output: Anagram
Input: silentt listens, Output: Not Anagram
*/
import java.util.*;
public class Example33 {
 static boolean isAnagram(String s1, String s2){
     s1 = s1.toLowerCase();
     s2 = s2.toLowerCase();
     while(true){
         if(s1.length()!=s2.length()) return false;
         if(s1=="" && s2=="") return true;
         char ch = s1.charAt(0);
         s1 = s1.replace(ch+"", "");
         s2 = s2.replace(ch+"", "");
     }
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next();
     String s2 = sc.next();
     if(isAnagram(s1, s2)) System.out.println(s1+" and "+s2+" is Anagram");
     else System.out.println(s1+" and "+s2+" is not Anagram");
     sc.close();
 }
}
