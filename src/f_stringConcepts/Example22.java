package f_stringConcepts;

//Convert string into title case

public class Example22 {
 static String titleCase(String s){
     return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
 }
 public static void main(String[] args) {
     String s1 = "java is an oops lang";
     String[] arr = s1.split(" ");

     String res = titleCase(arr[0]);
     for(int i=1; i<arr.length; i++){
         res+=" "+titleCase(arr[i]);
     }
     System.out.println(res);
 }
}
