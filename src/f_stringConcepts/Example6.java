package f_stringConcepts;

//StringBuilder is a mutable type object
//String reverse using STringBuilder

import java.util.Scanner;

public class Example6 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next();
     StringBuilder s2 = new StringBuilder(); // StringBuilder object creation
     for(int i=s1.length()-1; i>=0; i--){
         s2.append(s1.charAt(i));
     }
     System.out.println("Original string: "+s1);
     System.out.println("Reversed string as StringBuilder type: "+s2);
     String s3 = s2.toString();
     System.out.println("Reversed string as String type: "+s3);
     sc.close();
 }
}