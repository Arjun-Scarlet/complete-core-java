package f_stringConcepts;

//Print digits in a String
import java.util.*;
public class Example9 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String numStr = sc.next(); //he12llo98s7ir
     char[] arr = numStr.toCharArray();
     System.out.println("Digits in a String:");
     for(int i=0; i<arr.length; i++){
         if(arr[i]>='0' && arr[i]<='9') System.out.println(arr[i]);
     }
     sc.close();
 }
}
