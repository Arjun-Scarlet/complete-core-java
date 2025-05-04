package f_stringConcepts;

//Print consecutive repeated characters in a String
import java.util.*;
public class Example12 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.next(); //success
     char[] arr = str.toCharArray();
     int i = 0;
     while(i<arr.length){
         String res = arr[i]+"";
         char ch = arr[i];
         i++;
         while(i<arr.length && ch==arr[i]){
             res+=ch;
             i++;
         }
         if(res.length()>1) System.out.println(res);
     }
     sc.close();
 }
}
