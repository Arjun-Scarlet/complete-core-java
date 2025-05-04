package f_stringConcepts;

//Print sum of numbers in a String
import java.util.*;
public class Example11 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String numStr = sc.next(); //he12l5lo98s7ir
     char[] arr = numStr.toCharArray();
     int i = 0, sum = 0;
     System.out.println("Numbers in String:");
     while(i<arr.length){
         int n = 0;
         while(i<arr.length && arr[i]>='0' && arr[i]<='9'){
             n = n*10 + arr[i]-'0';
             i++;
         }
         if(n>0) System.out.println(n);
         sum+=n;
         i++;
     }
     System.out.println("Sum of numbers in String: "+sum);
     sc.close();
 }
}
