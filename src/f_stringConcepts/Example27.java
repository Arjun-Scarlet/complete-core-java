package f_stringConcepts;

//Input: "Java is a lang", Output: "lang a is Java" with in-built function

import java.util.*;
public class Example27 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     String[] arr = str.split(" ");
     String res = "";
     for(int i=arr.length-1; i>=1; i--){            //for(int i=1; i<arr.length; i++){
         res+=arr[i]+" ";                           //    res = arr[i]+" "+res;
     }                                              //}
     res+=arr[0];
     System.out.println(res);
     sc.close();
 }
}
