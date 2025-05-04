package f_stringConcepts;

//Input: su2ce2s --> Output: success
import java.util.*;
public class Example14 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     char[] arr = str.toCharArray();
     int i = 0;
     String res = "";
     while(i<arr.length){
         char ch = arr[i];
         i++;
         if(i<arr.length && ch>='0' && ch<='9'){
            int cnt = ch-'0';
            char repeat = arr[i];
            for(int j=1; j<=cnt; j++){
                 res+=repeat;
            }
            i++;
         }
         else res+=ch;
     }
     System.out.println("Original string: "+str);
     System.out.println("Modified string: "+res);
     sc.close();
 }
}
