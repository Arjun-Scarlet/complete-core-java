package f_stringConcepts;

//Count a given character occurance in a string using replace()

import java.util.*;
public class Example16 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the string: ");
     String s1 = sc.nextLine();
     System.out.print("Enter a character to count: ");
     char ch = sc.next().charAt(0);

     String del = s1.replace(ch+"", "");
     int cnt = s1.length() - del.length();
     System.out.println("Occurance of "+ch+": "+cnt); 
     sc.close();
 }
}
