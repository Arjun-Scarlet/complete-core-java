package f_stringConcepts;

//String Reverse
import java.util.*;
public class Example4 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = "saiyan";
     String s2 = "";
     for(int i=s1.length()-1; i>=0; i--){
         s2+=s1.charAt(i);
     }
     System.out.println("Original string: "+s1);
     System.out.println("Reversed string: "+s2);
     sc.close();
 }
}
