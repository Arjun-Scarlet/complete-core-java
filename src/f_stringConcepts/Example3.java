package f_stringConcepts;

//toCharArray()
public class Example3 {
 public static void main(String[] args) {
     String s1 = "Shadow";
     char[] arr = s1.toCharArray();
     System.out.println(arr);
     for(char ch:arr) System.out.println(ch);

     // Passing arr directly in string object is also possible
     String s2 = new String(arr);
     System.out.println(s2);
 }
}
