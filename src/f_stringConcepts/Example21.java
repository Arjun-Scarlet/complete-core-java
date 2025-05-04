package f_stringConcepts;

//split(input)
public class Example21 {
 public static void main(String[] args) {
     String s1 = "MHA, JK, DM, HxH";
     String s2 = "Java is Easy";
     System.out.println(s1.split(",")); //prints pseudo reference or default string representation  
     
     String[] arr = s1.split(",");
     for(String s:arr) System.out.print(s);
     System.out.println();
     
     String[] arr1 = s2.split("is");
     for(String s:arr1) System.out.print(s);
 }
}
