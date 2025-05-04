package f_stringConcepts;

//Print sum of digits in a String
import java.util.*;
public class Example10 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String numStr = sc.next(); //he12llo98s7ir
     char[] arr = numStr.toCharArray();
     int sum = 0;
     for(int i=0; i<arr.length; i++){
         if(arr[i]>='0' && arr[i]<='9') sum+=arr[i]-'0';
     }
     System.out.println("Sum of digits in String: "+sum);
     sc.close();
 }
}
